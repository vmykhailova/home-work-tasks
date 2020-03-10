public class AdvTriangle {

    public static void main(String[] args) {

      int ab = 7;
      int bc = 2;
      int ac = 8;

     if (ab == bc || bc == ac || ac == ab) {
         System.out.println("the triangle is isosceles");
     } else {
         System.out.println("the triangle isn't isosceles");
     }
   }
}
