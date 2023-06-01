import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Product> products = new ArrayList<>();
    public double getSum () {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }
    public void Order(){
        for(Product product : products){
            System.out.println(product.getName() + "   /   "+ product.getPrice()+ "   /   "  + product.getDesc());
        }
        System.out.println("[Sum}" + getSum());
    }
    public void ClearOrder() {products.clear();}
}
