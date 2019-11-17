public class Lab5a {
    public static void main(String[] args) {
        double a = 14000;
                      System.out.println(" Wartość inwestycji po pierwszym roku = " + (a = 1.4 *a) );
        System.out.println(" Wartość inwestycji po drugim roku = " + (a = a - 1500) );
        System.out.println(" Wartość inwestycji po trzecim roku = " + (a = a * 1.12) );
    }
}
