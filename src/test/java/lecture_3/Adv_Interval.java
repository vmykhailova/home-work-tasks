import java.util.Scanner;

public class Adv_Interval {

    public static void main(String[] args) {

        System.out.println("enter a number:");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number >= -5 && number <= 3) {
            System.out.println("this number is in the range");
        } else {
            System.out.println("this number isn't in the range");
        }

    }
}
