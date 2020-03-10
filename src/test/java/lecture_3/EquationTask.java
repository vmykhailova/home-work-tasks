public class EquationTask {

    public static void main(String[] args) {

        int a = 2;
        int b = 0;

        if (a == 0) {
            System.out.println("no solution");
        } else if (b == 0) {
            System.out.println("x = 0");
        } else
            System.out.println("x = " + - b / a);
    }
}
