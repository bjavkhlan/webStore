package dao;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductData {
    private static List<Product> products = new ArrayList<Product>() {{
        add(new Product(1000,"Laptop: Dell Latitude", "/resources/images/laptop.png"));
        add(new Product(1.5, "Pen: Bic", "/resources/images/bic.jpeg"));
        add(new Product( 0.9, "Notebook", "/resources/images/notebook.png"));
        add(new Product(50, "Wireless mouse: Logitech", "/resources/images/mouse.jpg"));
    }};
    private ProductData() {}

    public static Product getProductById(int productId) {
        for (Product product: products)
            if (product.getId() == productId) return product;

        return null;
    }
    public static List<Product> getProducts() { return products; }

}
