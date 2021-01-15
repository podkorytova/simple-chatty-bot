import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();
        Integer thousand = num / 1000;
        Integer hundred = (num % 1000) / 100;
        Integer ten = (num % 100) / 10;
        Integer one = num % 10;
        if (thousand.equals(one) && ten.equals(hundred)) {
            System.out.println("1");
        } else {
            System.out.println(num);
        }
    }
}