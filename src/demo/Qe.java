package demo;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

public class Qe {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    static class Quadratic{
         static void findroots(double a, double b, double c) {
             double d= ((b*b)-(4*a*c));
             double sqrt_value=sqrt(abs(d));
             String x="";
             if(a==0){
                 out.println("Invalid");
                 return;
             }
             if(d==0){
                 x = ((- b / (2 * a)) + "\n" + (-b / (2 * a)));
                 out.println("Both roots are equal and same \n" +x);
             }
             else if(d>0){
                 x= String.valueOf(((-b + sqrt_value)/(2*a))+ "\n" +((-b - sqrt_value)/(2*a)));
                 out.println("Both roots are real and different \n"+x);
             }
             else{
                 x= String.valueOf(((-b /(2*a) +"+" + df2.format(sqrt_value)+"i"))+ "\n" + (-b /(2*a) + "-" + df2.format(sqrt_value)+"i"));
                 out.println("The equation does nat have real roots " +x);
             }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        Quadratic.findroots(a,b,c);



    }

}
