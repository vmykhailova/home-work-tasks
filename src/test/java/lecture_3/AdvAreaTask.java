public class AdvAreaTask {
    public static void main(String[] args) {
        double round = 35;
        double square = 2;

        double diametr = (Math.sqrt(round / Math.PI)) * 2;
        double side = Math.sqrt(square);
        double diagonal = square * Math.sqrt(2);
        System.out.println(diametr);
        System.out.println(side);
        System.out.println(diagonal);

        if (diametr < side) {
            System.out.println("the round is squared");
        } else {
            System.out.println("the round isn't squared");
        }
        if (diagonal < diametr) {
            System.out.println("the square is placed in a round");
        } else {
            System.out.println("the square isn't placed in a round");
        }
    }
}
