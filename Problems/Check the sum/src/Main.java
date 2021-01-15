import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer c = scanner.nextInt();
        Boolean sumAB = a + b == 20;
        Boolean sumAC = a + c == 20;
        Boolean sumBC = b + c == 20;
        Boolean somePareSumEquilTwenty = sumAB || sumBC || sumAC;
        System.out.println(somePareSumEquilTwenty);
    }
}