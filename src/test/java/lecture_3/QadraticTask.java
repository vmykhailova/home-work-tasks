public class QadraticTask {

    public static void main(String[] args) {

        double a = 3.0;
        double b = -14.0;
        double c = -5.0;

    if (a == 0) {
        System.out.println("x = " + - c / b);
        System.exit(0);
    }
    double discr = (Math.pow(b, 2) - (4 * a * c));
    if (discr < 0) {
        System.out.println("not resolve");
    }
    else if (discr == 0) {
        System.out.println("x = " + - b / 2 * a);
    }
    else {
        double x1 = - (b + Math.sqrt(discr)) / (2 * a);
        double x2 = - (b - Math.sqrt(discr)) / (2 * a);
        System.out.println(discr + "x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
    }
}
