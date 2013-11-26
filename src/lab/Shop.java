package lab;
import java.text.NumberFormat;
import java.util.Scanner;
//***************************************************************
//Shop.java
//
//Uses the Item class to create items and add them to a shopping
//cart stored in an Array.
//***************************************************************

public class Shop {
    
    public static void main (String[] args) {
        
        ShoppingCart cart = new ShoppingCart();
        String itemName;
        double price;
        int quantity;
        
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";

        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.next();
            System.out.print("Enter the unit price: ");
            price = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();

            //add the item to the cart
            cart.addToCart(itemName, price, quantity);
            
            //print out the contents of the cart
            System.out.println(cart.toString());

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next();
            
        } while (keepShopping.equals("y"));
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("Please pay: " + fmt.format(cart.getTotalPrice()));
        
        scan.close();
    }
}
