public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weight = 72;// масса тела, кг
        double height = 1.87;// рост, м

        double Bmi = service.calculate(weight, height);

        System.out.println((int) Bmi);
    }
}
