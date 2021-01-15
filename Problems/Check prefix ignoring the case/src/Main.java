import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().toLowerCase(Locale.ROOT);
        String prefixString = "j";
        System.out.println(inputString.startsWith(prefixString));
    }
}