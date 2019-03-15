public class Product {
    private static int counter = 0;
    private int id;
    private double price;
    private String name;
    private String picturePath;

    public Product(double price, String name, String picturePath) {
        this.id = counter++;
        this.price = price;
        this.name = name;
        this.picturePath = picturePath;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
}
