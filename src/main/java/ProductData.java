import java.util.ArrayList;
import java.util.List;

public class ProductData {
    private List<Product> products;
    public ProductData() {
        products = new ArrayList<>();
        Product laptop = new Product(1000,"Laptop: Dell Latitude");
        Product pen = new Product(1.5, "Pen: Bic");
        Product notebook = new Product( 0.9, "Notebook");
        Product mouse = new Product(50, "Wireless mouse: Logitech");
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
