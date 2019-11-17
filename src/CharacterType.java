public class CharacterType {
    public static void main(String[] args) {
        showInfo('a');
        showInfo('ą');
        showInfo('Ź');
        showInfo('Ó');
        showInfo('h');
        showInfo('ś');

    }


    public static void showInfo(char c) {
        System.out.println("Kod znaku ' " + c + "' to: " + (int)c);
    }
}
