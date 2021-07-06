import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Purchaser{
  void purchase(Size s, String color);
}

class NewPurchase implements Purchaser{

  public void purchase(Size s, String color){
    System.out.println("You have started an order and have an empty cart.");
  }

}

abstract class ProductPurchaser implements Purchaser{

  Cart c1 = new Cart();

  private Purchaser purchaser;

  public ProductPurchaser(Purchaser p){
    purchaser = p;
  }

  public void purchase(Size s, String color){
  }

}


class ShirtPurchaser extends ProductPurchaser{

  public ShirtPurchaser(Purchaser p){
    super(p);
  }

  public void purchase(Size s, String color){
    c1.addtoCart("Shirt", s, color);
  }

}


class SweatshirtPurchaser extends ProductPurchaser{

  public SweatshirtPurchaser(Purchaser p){
    super(p);
  }

  public void purchase(Size s, String color){
    c1.addtoCart("Sweatshirt", s, color);
  }

}


class SocksPurchaser extends ProductPurchaser{

  public SocksPurchaser(Purchaser p){
    super(p);
  }

  public void purchase(Size s, String color){
    c1.addtoCart("Socks", s, color);
  }

}


class PoloPurchaser extends ProductPurchaser{

  public PoloPurchaser(Purchaser p){
    super(p);
  }

  public void purchase(Size s, String color){
    c1.addtoCart("Polo", s, color);
  }

}
