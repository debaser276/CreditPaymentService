public class Main {
    public static void main(String[] args) {
        int credit = 1_000_000;
        int period1 = 12;
        int period2 = 24;
        int period3 = 36;
        double percent = 9.99;
        CreditPaymentService service = new CreditPaymentService();
        int payment1 = service.calculate(credit, period1, percent);
        int payment2 = service.calculate(credit, period2, percent);
        int payment3 = service.calculate(credit, period3, percent);
        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);
    }
}
