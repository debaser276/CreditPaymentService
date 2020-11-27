public class CreditPaymentService {
    public int calculate(int credit, int period, double percent) {
        double factor = percent / 12 / 100;
        return (int) (credit * ((factor * Math.pow(1 + factor, period))/(Math.pow(1 + factor, period) - 1)));
    }
}
