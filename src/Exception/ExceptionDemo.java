package Exception;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.println("result is "+c);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator can't be zero,Try again!!");
        }
        System.out.println("Bye");
    }
}
