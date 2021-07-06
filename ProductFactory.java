
interface ProductMaker{
  Product makeProduct(Size size, String color);
}

class ShirtMaker implements ProductMaker{
  public Product makeProduct(Size size, String color){
    return new Shirt(size, color);
  }
}

class SweatshirtMaker implements ProductMaker{
  public Product makeProduct(Size size, String color){
    return new Sweatshirt(size, color);
  }
}

class SocksMaker implements ProductMaker{
  public Product makeProduct(Size size, String color){
    return new Socks(size, color);
  }
}

class PoloMaker implements ProductMaker{
  public Product makeProduct(Size size, String color){
    return new Polo(size, color);
  }
}
