public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = service.calculate(1_000_000, 9.99, 36);
        System.out.println(payment);
    }
}