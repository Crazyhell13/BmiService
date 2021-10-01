public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 80f, height = 1.77f;
        float bmi = service.calculate(weight,height);
        System.out.println(bmi);
    }
}
