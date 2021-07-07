# OnlineShoppingOOD
An online shopping experience designed using objected oriented design principles and patterns as the primary focus.

This code was submitted as a final semester long project for my Object Oriented Design Class. When tasked with creating a proejct that would use object oriented design patterns to model various components, I decided to tackle a concept I was very familiar with as a user, but not as coder: how an online bookstore might model their buying processes. 

The items of clothing present in my online store are shirts, socks, sweatshirts, and shorts. All of these classes implement the Product interface, and have attributes of price, size, and color. The creation of all "product" items is handled by ProductMaker.java, which uses the the Factory pattern. All items, once created, are stored in a stock, which is detailed in Stock.java.

To "purchase" items, Cart.java was made using the Decorator pattern to handle all purchases. The decorator pattern was used as the order of produts added to cart is irrelevant, so adding different items to the cart in any arbitrary order can be seen as "decorating" the cart with clothes. 


To run the code, download the repository and run the OnlineBookstore.java file. OnlineBookstore is the driver file and contains code which populates the store stock with some sample items of clothing, then attempts to purchase from the store. 

More information can be found on my website, josephporpora.com.
