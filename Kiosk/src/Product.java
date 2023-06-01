//자식
public class Product extends Menu {
    double price;

    public Product (String name, double price, String desc) {
        super(name, desc);
        this.price = price;
    }
    @Override
    public String toString() {
        return name + " | " + price + " | " + desc;
    }
    public double getPrice(){ return this.price;}
}
