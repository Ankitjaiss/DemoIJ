import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int a,b,f;
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i==1 || i==0)
                continue;
            f=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    f=0;
                    break;
                }
            }
            if(f==1)
                System.out.println(i);

        }
    }
}
