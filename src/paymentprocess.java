abstract class PaymentMethod {
    protected double amount;
    
    public PaymentMethod(double amount) {
        this.amount = amount;
    }
    abstract void processPayment();
}
class CreditCard extends PaymentMethod {
    private static final double TRANSACTION_FEE = 2.0;    
    public CreditCard(double amount) {
        super(amount);
    }   
    @Override
    void processPayment() {
        double totalAmount = amount + TRANSACTION_FEE;
        System.out.println("Processing Credit Card payment of $" + amount + " with a fee of $" + TRANSACTION_FEE + " (Total: $" + totalAmount + ")");
    }
}
class PayPal extends PaymentMethod {
    public PayPal(double amount) {
        super(amount);
    }
    
    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount + " with no additional fee.");
    }
}
class paymentprocess {
    public static void processTransaction(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }
    
    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCard(100.0);
        PaymentMethod payPalPayment = new PayPal(150.0);
        
        System.out.println("--- Transaction Processing ---");
        processTransaction(creditCardPayment);
        processTransaction(payPalPayment);
    }
}
