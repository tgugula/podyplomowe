import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {
        Point location = new Point (4, 13);
        Point point;

        System.out.println("Położenie początkowe: " + location);
        System.out.println("x równe: " + location.x);
        System.out.println("y równe: : " + location.y);
        System.out.println("\nPrzejście do punku (7,6)");
        location.x = 7;
        location.y = 6;
        point = location; //od tej pory point wskazuje na ten sam obiekt co location
        point.x = 0;
        point.y = 0;

        System.out.println("Położenie końcowe: " + location);
        System.out.println("x równe: " + location.x);
        System.out.println("y równe: : " + location.y);

        location = null;
        point = null;
        // Garbage collector - mo zna już posprzątać. bo nie ma referencji do Point
    }
}
