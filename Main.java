import javax.swing.*;

public class Main {
    private static ProductView view;
    private static ProductRepository repository;
    private static ProductController controller;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gerenciamento de produtos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        view = new ProductView();
        frame.add(view);

        repository = new ProductRepository();
        controller = new ProductController(repository, view); 
        frame.setVisible(true);
    }
}
