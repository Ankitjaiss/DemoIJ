package Exception;

public class CheckedUnchecked {
    public static void main(String[] args) {
        fun3();
    }

     static void fun3() {
        fun2();
    }

    static void fun2(){
        fun1();
    }
    static void fun1(){
        try{
             throw new LowBalanceException();
         }
         catch (LowBalanceException l){
             System.out.println(l);
         }
    }


    }

 class LowBalanceException extends Exception {
     @Override
     public String toString() {
         return "Balance shouldn't be less than 5000";
     }
 }