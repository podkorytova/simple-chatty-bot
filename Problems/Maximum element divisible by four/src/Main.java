import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxNum = 0;
        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            maxNum = (num % 4 == 0) ? Math.max(num, maxNum) : maxNum;
        }
        System.out.print(maxNum);
    }
}