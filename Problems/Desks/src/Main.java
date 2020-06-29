import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        a = (a%2 == 1) ? (a / 2) + 1 : a / 2;
        b = (b%2 == 1) ? (b / 2) + 1 : b / 2;
        c = (c%2 == 1) ? (c / 2) + 1 : c / 2;
        System.out.println(a+b+c);
    }
}