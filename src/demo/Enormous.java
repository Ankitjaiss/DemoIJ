package demo;

import java.util.Scanner;
import static java.lang.System.*;

public class Enormous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        long t;
        int c=0;
        long[] l =new long[n];
        for(int i=0;i<n;i++){
            t=sc.nextLong();
            l[i]=t;
        }

        for(long n1:l){
            if(n1%k==0) {
                ++c;
            }
        }
        out.println(c);
    }
}
