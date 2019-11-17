public class BinaryConverter {
    public static void main(String[] args) {
        String binary = "101";
        long result = 0L;

        // 1 0 1 - liczba binarnie
        // 0 1 2 - indeks
        // 2 1 0 - (długość - indeks - 1) <- indeks odwrócony
        // 1*2^2 + 0*2^1 + 1*2^0

        System.out.println("Liczba binarnie " + binary);
        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - i - 1;
            char c = binary.charAt(i);
            result += Character.getNumericValue(c) * Math.pow(2,reversIndex); // 1*2^2
            //System.out.print(binary.charAt(i) + " ");
            System.out.println();
        }
        System.out.println("Liczba dziesiętnie " + result);
    }
}
