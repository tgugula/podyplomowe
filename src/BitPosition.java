public class BitPosition {
    public static void main(String[] args) {
        int i =123; // nasza liczba
        int n = 1;  // pozycja bitu
        int mask = 1 << n;
        boolean result = (i & mask) > 0;
        System.out.print(" Dla liczby  " +  i  + " na pozycji " + n);
        System.out.println(" znajduje się bit " + result);
        System.out.println(String.format ("%32s" , Integer.toBinaryString(i)).replace(' ', '0'));
        System.out.println(String.format ("%32s" , Integer.toBinaryString(i)).replace(' ', '0'));
        System.out.println("---------------------------------------");
        System.out.println(String.format ("%32s" , Integer.toBinaryString(i & mask)).replace(' ', '0'));
    }
}
