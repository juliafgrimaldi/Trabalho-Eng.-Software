import java.sql.SQLException;
import java.util.*;
import java.awt.event.*;

public class ProductController {
    private ProductRepository repository;
    private ProductView view;

    public ProductController(ProductRepository repository, ProductView view) {
        this.repository = repository;
        this.view = view;

        view.getAddButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = view.getNameField().getText();
                    double price = Double.parseDouble(view.getPriceField().getText());

                    Product product = new Product(name, price);
                    repository.saveProduct(product);
                    view.getTextArea().setText("Produto adicionado.");
                } catch(SQLException ex) {
                    view.getTextArea().append("Erro" + ex.getMessage() + "\n");
                }
            }
        });

        view.getShowAllButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    List<Product> products = repository.getAllProducts();

                    view.getTextArea().setText("");
                    for(Product product : products) {
                        view.getTextArea().append(product.toString() + "\n");
                    }
                } catch(SQLException ex) {
                    view.getTextArea().append("Erro" + ex.getMessage() + "\n");
                }
            }
        });
    }
}
