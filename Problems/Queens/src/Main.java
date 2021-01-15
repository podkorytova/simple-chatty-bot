import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer x1 = scanner.nextInt();
        Integer y1 = scanner.nextInt();
        Integer x2 = scanner.nextInt();
        Integer y2 = scanner.nextInt();
        if (x1.equals(x2) || y1.equals(y2) || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}