public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60.0;
        double height = 1.6;
        double result = service.calculate(weight, height);
        System.out.println("Индекс массы тела " + result + " кг/м2");
    }
}