public class OnlineBookstore{

  public static void main (String [] args)
  {
    Stock stock = new Stock();
    stock.addtoStock("Polo", Size.L, "Gold", 2);

    Purchaser cart3 = new PoloPurchaser(new NewPurchase());
    System.out.println("Testing third purchase");
    cart3.purchase(Size.M, "Gold");
    Cart.showOrder();

    cart3 = new SocksPurchaser(cart3);
    cart3.purchase(Size.L, "Gold");
    Cart.showOrder();

    cart3 = new PoloPurchaser(cart3);
    cart3.purchase(Size.L, "Gold");
    Cart.showOrder();
  }

}
