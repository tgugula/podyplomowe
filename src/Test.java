import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
 int a = 1;
 int b = 5;
        System.out.println(String.format("%32s", Integer.toBinaryString(1).replace(' ', '0')));
        System.out.println(String.format("%32s", Integer.toBinaryString(-1).replace(' ', '0')));
        System.out.println(String.format("%8s", Integer.toBinaryString(a ^ b).replace(' ', '0')));
        System.out.println(1 + 2 + "z");
        System.out.println(1 + 2);
        System.out.println("a" + 1 + 2 + "z");
        System.out.println(6 + 4 /2);
        System.out.println((6 + 4) /2);
    }

}