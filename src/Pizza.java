enum PizzaSize{
    SMALL,MEDIUM,LARGE
}

public class Pizza {
    private double price;
    private String pizzaName;
    private PizzaSize size;

    public Pizza(String pizzaName,double price,PizzaSize size){
        this.pizzaName=pizzaName;
        this.price=price;
        this.size=size;
    }

    public double checkDiscount(){
        PizzaSize currentsize=this.size;
        double discount=0;

        switch(currentsize){
            case SMALL:
                discount=10;
                break;
            case MEDIUM:
                discount=20.5;
                break;
            case LARGE:
                discount=30.2;
                break;
        }
        return discount;
    }

    public static void main(String[] args) {
        Pizza myPizza= new Pizza("VegFeast",500,PizzaSize.MEDIUM);
        System.out.println("Discount is"+myPizza.checkDiscount());
        for(PizzaSize psize:PizzaSize.values()){
            System.out.println(psize + " " +psize.ordinal());
        }
    }
}
