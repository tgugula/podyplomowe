public class Matrix {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("n = ");
        for (int j = 0; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.printf("%3s",i + j + " ");
            }
            System.out.println();
        }
    }
}
