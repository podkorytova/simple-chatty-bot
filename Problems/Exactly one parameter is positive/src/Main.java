import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer c = scanner.nextInt();
        Boolean aMoreThanZero = a > 0 && b <= 0 && c <= 0;
        Boolean bMoreThanZero = a <= 0 && b > 0 && c <= 0;
        Boolean cMoreThanZero = a <= 0 && b <= 0 && c > 0;
        System.out.println(aMoreThanZero || bMoreThanZero || cMoreThanZero);
    }
}