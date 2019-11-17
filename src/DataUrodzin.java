import java.util.StringTokenizer;

public class DataUrodzin {
    public static void main(String[] args) {
        String birthday = "29/04/2016";
        StringTokenizer st = new StringTokenizer(birthday, "/");
        System.out.println("Dzień: " + st.nextToken());
        System.out.println("Miesiąc: " + st.nextToken());
        System.out.println("Rok: " + st.nextToken());
    }
}

