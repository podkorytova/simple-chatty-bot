import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float m = scanner.nextInt();
        float p = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;
        while (m < k) {
            m = m * (p / 100) + m;
            i++;
        }
        System.out.println(i);
    }
}