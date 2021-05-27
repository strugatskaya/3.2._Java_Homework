public class bmiService {
    public double calculate(double high, double weight) {
        double BMI = (double) weight / (high * high); // метры, киллограммы
        return BMI;
    }
}
