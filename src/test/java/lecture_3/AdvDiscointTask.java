public class AdvDiscointTask {
    public static void main(String[] args) {
        double a = 1200.0;
        double discount = 15.0;

        if (a > 1000.0) {
            System.out.println("Sum with discount = " + (a - (a * discount / 100)));
        } else {
            System.out.println("no discount");
        }
    }
}
