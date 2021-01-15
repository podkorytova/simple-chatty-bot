import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String outputText = inputText.replace("a", "b");
        System.out.println(outputText);
    }
}