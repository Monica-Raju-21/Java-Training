package Polymorphism;

class Payment{
    void process(){
        System.out.println("Processing a generic payment");
    }
}

class CreditCard extends Payment{
    @Override
    void process(){
        System.out.println("Processing credit payment:Validating CVV");
    }
}

class UPI extends Payment{
    @Override
    void process(){
        System.out.println("Processing UPI Payment:Scanning QR code");
    }
}
public class PolymorphismExample3 {
    public static void main(String[] args){
        Payment myPay;

        myPay =new CreditCard();
        myPay.process();

        myPay=new UPI();
        myPay.process();
    }
}
