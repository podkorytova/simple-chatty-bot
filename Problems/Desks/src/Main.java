import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer firstClass = scanner.nextInt();
        Integer secondClass = scanner.nextInt();
        Integer thirdClass = scanner.nextInt();
        Integer countDesks = firstClass / 2 + secondClass / 2 + thirdClass / 2;
        countDesks += firstClass % 2 + secondClass % 2  + thirdClass % 2;
        System.out.println(countDesks);
    }
}