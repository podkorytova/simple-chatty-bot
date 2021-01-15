import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer value = scanner.nextInt();
        System.out.println(value > 0 && value < 10);
    }
}