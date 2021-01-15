import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameCity = scanner.nextLine();
        String endCity = "burg";
        if (nameCity.length() < endCity.length()) {
            System.out.println("false");
        } else if (nameCity.endsWith(endCity)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}