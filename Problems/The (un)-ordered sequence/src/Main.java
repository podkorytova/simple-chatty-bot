import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int i = scanner.nextInt();
        while (k == i) {
            i = scanner.nextInt();
        }
        boolean isAsc = i > k;
        while (true) {
            if (i == 0) {
                System.out.println("true");
                break;
            }
            if (isAsc ? i >= k : k >= i) {
                k = i;
                i = scanner.nextInt();
            } else {
                System.out.println("false");
                break;
            }
        }
    }
}