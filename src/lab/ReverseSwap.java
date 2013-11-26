package lab;
import java.util.Scanner;

public class ReverseSwap {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter an integer: ");
        int[] values = new int[scan.nextInt()];
       
        for (int i=0; i<values.length; i++) {
            System.out.print("Please enter a value: ");
            values[i] = scan.nextInt();
        }
        
        System.out.println("\nArray");
        System.out.println("------------------ ");
        for (int i=0; i<values.length; i++) {
            System.out.print(values[i] + "  ");
        }
        
        int j = (values.length - 1);
        for (int i=0; i<(values.length/2); i++) {
            int temp = values[i];
            values[i] = values[j];
            values[j--] = temp;
        }
        
        System.out.println("\nReversed Array");
        System.out.println("------------------ ");
        for (int i=0; i<values.length; i++) {
            System.out.print(values[i] + "  ");
        }
        
        scan.close();
    }
}
