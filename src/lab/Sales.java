package lab;
import java.util.Scanner;
//***************************************************************
//Sales.java
//
//Reads in and stores sales for each of 5 salespeople. Displays
//sales entered by salesperson id and total sales for all salespeople.
//
//***************************************************************
public class Sales {
    
    public static void main(String[] args) {
        
        int salesPeople;
        int[] sales;
        int sum, max, maxPerson, min, minPerson, val, total;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter an amount of salespeople: ");
        salesPeople = scan.nextInt();
        sales = new int[salesPeople];
        
        for (int i=0; i<sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        
        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0;
        max = sales[0];
        maxPerson = 1; 
        min = sales[0];
        minPerson = 1;
        for (int i=0; i<sales.length; i++) {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i] > max) {
                max = sales[i];
                maxPerson = (i+1);
            }
            if (sales[i] < min) {
                min = sales [i];
                minPerson = (i+1);
            }
        }
        
        System.out.println("\nTotal sales: $" + sum);
        System.out.println("\nAverage sales: $" + (sum / salesPeople));
        System.out.println("\nSalesperson " + maxPerson + " has the highest "
                + "sale with $" + max);
        System.out.println("\nSalesperson " + minPerson + " has the lowest "
                + "sale with $" + min);
        
        System.out.print("\nPlease enter a sales value: ");
        val = scan.nextInt();
        
        System.out.println("\nSalespeople Sales Exceeding Value");
        System.out.println(" ------------------ ");
        
        total = 0;
        for (int i=0; i<sales.length; i++) {
            if (sales[i] > val) {
                System.out.println(" " + (i+1) + " " + sales[i]);
                total++;
            }
        }
        System.out.println("\nTotal salespeople above value: " + total);
        
        scan.close();
    }
}