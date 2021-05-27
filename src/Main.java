public class Main {
    public static void main(String[] args) {
        bmiService service = new bmiService();
        double BMI = service.calculate( 1.56,  47);
        System.out.println(BMI);
    }
}