public class MagnitudeTask {

    public static void main(String[] args) {

        int a = 91;
        int b = 91;

        if (Math.abs(a) > Math.abs(b)) {
            System.out.println("magnitude a is the greatest than magnitude b ");
        } else if (Math.abs(a) < Math.abs(b)) {
            System.out.println("magnitude b is the greatest than magnitude a ");
        } else
            System.out.println("the magnitudes are equal");
    }
}
