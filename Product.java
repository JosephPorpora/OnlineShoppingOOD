import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Product{
  int getPrice();
  Size getSize();
  String getColor();
  String toString();
}

class Shirt implements Product{

  int price = 30;
  Size size;
  String color;

  public Shirt(Size s, String c){
    size = s;
    color = c;
  }

  public int getPrice(){
    return price;
  }

  public Size getSize(){
    return size;
  }

  public String getColor(){
    return color;
  }

  public String toString(){
    return "(" + this.getClass().getName() + ", " + size + ", " + color + ")";
  }

}

class Sweatshirt implements Product{

  int price = 50;
  Size size;
  String color;

  public Sweatshirt(Size s, String c){
    size = s;
    color = c;
  }

  public int getPrice(){
    return price;
  }
  public Size getSize(){
    return size;
  }

  public String getColor(){
    return color;
  }

  public String toString(){
    return "(" + this.getClass().getName() + ", " + size + ", " + color + ")";
  }

}

class Socks implements Product{

  int price = 10;
  Size size;
  String color;

  public Socks(Size s, String c){
    size = s;
    color = c;
  }

  public int getPrice(){
    return price;
  }

  public Size getSize(){
    return size;
  }

  public String getColor(){
    return color;
  }

  public String toString(){
    return "(" + this.getClass().getName() + ", " + size + ", " + color + ")";
  }

}

class Polo implements Product{

  int price = 40;
  Size size;
  String color;

  public Polo(Size s, String c){
    size = s;
    color = c;
  }

  public int getPrice(){
    return price;
  }
  public Size getSize(){
    return size;
  }

  public String getColor(){
    return color;
  }

  public String toString(){
    return "(" + this.getClass().getName() + ", " + size + ", " + color + ")";
  }

}
