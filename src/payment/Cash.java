package payment;

public class Cash extends Payment {
    @Override
    public String getPaymentType() {
        return "Cash";
    }

    @Override
    public boolean ProcessPayment() {
        System.out.println("Payment Processed with Cash");
        return true;
    }
}
