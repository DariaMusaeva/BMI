// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        float height = 1.87F;
        int imb = service.calculate(weight, height);

        System.out.println(imb);
    }
}