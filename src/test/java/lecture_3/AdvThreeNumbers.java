public class AdvThreeNumbers {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int max;
        int min;
        int avrg;

        max = a > b ? a : b;
        max = c > max ? c : max;
        min = a < b ? a : b;
        min = c < min ? c : min;
        if (a != min && a != max) {
            avrg = a;
        } else if (b != min && b != max) {
            avrg = b;
        } else {
            avrg = c;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("avrg = " + avrg);
    }
}

