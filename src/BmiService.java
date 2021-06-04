public class BmiService {
    public double calculate(double high, double weight) {
        double bmi = (double) weight / (high * high); // метры, киллограммы
        return bmi;
    }
}
