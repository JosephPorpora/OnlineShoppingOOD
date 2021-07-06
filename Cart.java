import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart{

  private int total;
  private static ArrayList<Product> order = new ArrayList<Product>();

  public Cart(){
  }

  public static int getPrice(){
    int orderprice = 0;
    for (int i = 0; i < order.size(); i++) {
      orderprice += order.get(i).getPrice();
    }
    return orderprice;
  }

  public void addtoCart(String product, Size s, String c){

    Stock check = new Stock();

    ArrayList<Product> stock = check.getStock(product);

    for (int i = 0; i < stock.size(); i++) {
      Product p = stock.get(i);
      if(p.getSize() == s && p.getColor() == c){
        order.add(p);
        stock.remove(p);
        return;
      }
    }
    System.out.println("Item not in stock.");
    return;
  }

  public static ArrayList<Product> getOrder(){
    return order;
  }

  public static void showOrder(){
    System.out.println("Your order: " + getOrder() + " " + getPrice());
  }

}
