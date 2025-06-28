package payment;

public class Card extends Payment {
    @Override
    public String getPaymentType() {
        return "Card";
    }

    @Override
    public boolean ProcessPayment() {
        System.out.println("Payment Processed with Card");
        return true;
    }
}
