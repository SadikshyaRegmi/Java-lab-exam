package Sixth;



class Payment {
    void makePayment() {
        System.out.println("Payment method is undefined");
    }
}

class CreditCard extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment made using Credit Card");
    }
}

class PayPal extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment made using PayPal");
    }
}

public class PolymerphismExample2 {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.makePayment();

        Payment credit = new CreditCard();
        credit.makePayment();

        Payment paypal = new PayPal();
        paypal.makePayment();
    }
}


