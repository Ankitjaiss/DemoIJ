public class ArrayDemo {
    public static void main(String[] args) {
        int arr[]={281, 344, 265, 272, 236, 324, 287};
        double avg,sum=0;

        for(int i=0;i< arr.length;i++){
            sum+=arr[i];

        }
        avg=sum/arr.length;
        System.out.println("The avg score is "+avg);
        int c=0,d=0,e=0;
        for(int  b:arr){
            if(b>avg){

                c+=1;

            }

             if(b==avg){

                d+=1;

            }

            if(b<avg){

                e+=1;

            }

        }
        System.out.println("Above avg "+c);
        System.out.println("Equal avg "+d);
        System.out.println("Below avg "+e);


    }
}
