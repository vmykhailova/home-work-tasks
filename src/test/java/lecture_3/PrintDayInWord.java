public class PrintDayInWord {

    public static void main(String[] args) {

        int day = 1;
        boolean flag = true;

        if (!flag) {
            System.out.println("IF");
            if (day == 1) {
                System.out.println("SUNDAY");
            } else if (day == 2) {
                System.out.println("MONDAY");
            } else if (day == 3) {
                System.out.println("THURSDAY");
            } else if (day == 4) {
                System.out.println("WEDNESDAY");
            } else if (day == 5) {
                System.out.println("THURSDAY");
            } else if (day == 6) {
                System.out.println("FRIDAY");
            } else if (day == 7) {
                System.out.println("SATURDAY");
            } else {
                System.out.println("Not a valid day");
            }
        } else {
            System.out.println("SWITCH operator");

            switch(day) {
                case 1:
                    System.out.println("SUNDAY");
                    break;
                case 2:
                    System.out.println("MONDAY");
                    break;
                case 3:
                    System.out.println("THURSDAY");
                    break;
                case 4:
                    System.out.println("WEDNESDAY");
                    break;
                case 5:
                    System.out.println("THURSDAY");
                    break;
                case 6:
                    System.out.println("FRIDAY");
                    break;
                case 7:
                    System.out.println("SATURDAY");
                    break;
                default:
                    System.out.println("Not a valid day");
            }
        }
    }
}

