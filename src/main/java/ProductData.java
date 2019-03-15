import java.util.ArrayList;
import java.util.List;

public class ProductData {
    private List<Product> products;
    public ProductData() {
        products = new ArrayList<>();
        Product laptop = new Product(1000,"Laptop: Dell Latitude", "/resources/images/laptop.png");
        Product pen = new Product(1.5, "Pen: Bic", "/resources/images/bic.jpeg");
        Product notebook = new Product( 0.9, "Notebook", "/resources/images/notebook.png");
        Product mouse = new Product(50, "Wireless mouse: Logitech", "/resources/images/mouse.jpg");
        products.add(laptop);
        products.add(pen);
        products.add(notebook);
        products.add(mouse);
    }
    public Product getProductById(int productId) {
        for (Product product: products)
            if (product.getId() == productId) return product;

        return null;
    }
    public List<Product> getProducts() { return products; }

}
