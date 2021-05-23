public class BmiService {
        public double calculate(double High, double Weight) {
double            BMI = (double) Weight / (High * High); // метры, киллограммы
            return BMI;
        }
    }
