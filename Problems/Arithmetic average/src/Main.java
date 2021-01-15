import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double j = 0;
        double sum = 0;
        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                j++;
            }
        }
        double average = sum / j;
        System.out.println(average);
    }
}