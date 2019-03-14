import java.util.ArrayList;
import java.util.List;

public class ProductData {
    private List<Product> products;
    public ProductData() {
        products = new ArrayList<>();
        Product laptop = new Product();
        Product pen = new Product();
        Product notebook = new Product();
        Product mouse = new Product();
        products.add(laptop);
        products.add(pen);
        products.add(notebook);
        products.add(mouse);
    }
    public List<Product> getProducts() { return products; }

}
