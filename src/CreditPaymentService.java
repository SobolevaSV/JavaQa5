public class CreditPaymentService {
    public int calculate(int credit, double rateYear, int period) {
        double rateMonth = rateYear / 12 / 100; // месячная ставка в долях от единицы
        double coefficient = (rateMonth * Math.pow((1 + rateMonth), period)) /
                (Math.pow((1 + rateMonth), period) - 1);
        double payment = credit * coefficient; // размер ежемесячного платежа
        return (int) payment;
    }
}
