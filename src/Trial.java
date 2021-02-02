import java.util.Arrays;
import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of marks:");
        int n= scan.nextInt();
        int marks = 0;
        int sum = 0;
        int i=0;
        while (i<n)
        {
            marks = scan.nextInt();
            sum += marks;
            i++;
        }
        System.out.println("The average is:" + (sum/i));*/

        String[] pizzaSize = {"Regular", "Medium", "Large"};
        int[] pizzaCost = {100, 250, 390};
        String[] pizzaOrdered = {"Medium", "Regular"};
        int[] quantityOrdered = {2, 1};
        float totalAmount = 0f;
        for(int index1 = 0; index1 < pizzaOrdered.length ; index1++) {
            for(int index2 = 0; index2 < pizzaSize.length ; index2++) {
                if ( pizzaOrdered[index1] == pizzaSize[index2] ) {
                    totalAmount += pizzaCost[index2] * quantityOrdered[index1];
                }
                else {
                    totalAmount += 0;
                }
            }
        }
        totalAmount = totalAmount - (totalAmount*(float)5/100);
        System.out.println("Your total bill amount is: "+totalAmount);


    }
}
