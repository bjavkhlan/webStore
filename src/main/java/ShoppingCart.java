import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }
    public int getSize() {
        return items.size();
    }
    public List<Product> getItems() {
        return items;
    }
    public void addItem(Product product) {
        if (product != null)
            items.add(product);
    }
    public double calculateTotalPrice() {
        double result = 0.0;
        for (Product item: items)
            result += item.getPrice();
        return result;
    }
}
