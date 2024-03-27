import javax.swing.*;
import java.awt.event.*;

public class ProductView extends JPanel {
    private JTextField nameField;
    private JTextField priceField;
    private JButton addButton;
    private JButton showAllButton;
    private JTextArea textArea;

    public ProductView() {
        nameField = new JTextField(20);
        priceField = new JTextField(10);
        addButton = new JButton("Adicionar ao BD");
        showAllButton = new JButton("Mostrar todos os produtos");
        textArea = new JTextArea();

        add(new JLabel("Nome:"));
        add(nameField);
        add(new JLabel("Preco:"));
        add(priceField);
        add(addButton);
        add(showAllButton);
        add(new JScrollPane(textArea));
    }
    public JButton getAddButton() {
        return addButton;
    }
    public JButton getShowAllButton() {
        return showAllButton;
    }
    public JTextArea getTextArea() {
        return textArea;
    }
    public JTextField getNameField() {
        return nameField;
    }
    public JTextField getPriceField() {
        return priceField;
    }
}
