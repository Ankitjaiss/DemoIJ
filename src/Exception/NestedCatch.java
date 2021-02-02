package Exception;

public class NestedCatch {
    public static void main(String[] args) {
        int A[]={1,2,3,4,0};

        try{
            int c=A[0]/A[4];
            System.out.println("Division is "+c);
            try{
                System.out.println(A[5]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index is Invalid");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Dominator can't be zero, Try again!!");
        }
    }
}
