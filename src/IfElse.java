import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char word=sc.next().charAt(0);

        if(word>=65 && word<=90)
            System.out.println("1");
        else if(word>=97 && word<=122)
            System.out.println("0");
        else
            System.out.println("-1");
    }
}
