import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock{

  static ArrayList<Product> shirtstock = new ArrayList<Product>();
  static ArrayList<Product> sweatshirtstock = new ArrayList<Product>();
  static ArrayList<Product> socksstock = new ArrayList<Product>();
  static ArrayList<Product> polostock = new ArrayList<Product>();

  public void addtoStock(String product, Size size, String color){
    if(product == "shirt" || product == "Shirt"){
      ShirtMaker sm = new ShirtMaker();
      shirtstock.add(sm.makeProduct(size,color));
    }
    else if(product == "sweatshirt" || product == "Sweatshirt"){
      SweatshirtMaker swm = new SweatshirtMaker();
      sweatshirtstock.add(swm.makeProduct(size,color));
    }
    else if(product == "socks" || product == "Socks"){
      SocksMaker som = new SocksMaker();
      socksstock.add(som.makeProduct(size,color));
    }
    else if(product == "polo" || product == "Polo"){
      PoloMaker pm = new PoloMaker();
      polostock.add(pm.makeProduct(size,color));
    }
  }

  public void addtoStock(String product, Size size, String color, int q){
    for (int i = 0; i < q; i++) {
      addtoStock(product, size, color);
    }
  }

  public ArrayList<Product> getStock(String product){
    if(product == "Shirt"){
      return shirtstock;
    }
    else if(product == "Sweatshirt"){
      return sweatshirtstock;
    }
    else if(product == "Socks"){
      return socksstock;
    }
    else{
      return polostock;
    }
  }
}
