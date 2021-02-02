package demo;

import static java.lang.System.*;

enum Category {
    MOBILE,TABLET,COMPUTER,LAPTOP
}

class Shop {
    private double amount;
    private Category type;
    private double discount;
    Shop(double amount,Category type){
        this.amount=amount;
        this.type=type;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Category getType() {
        return type;
    }

    public void checkDiscountApplicability(double amount,Category type)
    {
        if(amount>=30000){
            out.println("congratulations you are applicable for discount");
            this.applyDiscount(type);
        }
        else {

            out.println("Thank you for shopping, your bill amount is: " + this.getAmount());
        }

    }
    public void applyDiscount(Category type) {
        //write your logic here
        if(type==Category.MOBILE && amount>=30000.0){
            setDiscount(15);
            out.print(" on "+type);
        }

    }


}
class Exercise2 {

    public static void main(String[] args) {
		Shop shop=new Shop(30000.0,Category.MOBILE);
 		shop.checkDiscountApplicability(shop.getAmount(),shop.getType());
    }

}

