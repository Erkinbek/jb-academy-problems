import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        int a = x / 100;
        int b = x % 100;
        b = b / 10;
        int c = x % 10;
        System.out.println(a+b+c);
    }
}