import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        int d = Integer.parseInt(scanner.next());
        System.out.print(--a + " ");
        System.out.print(--b + " ");
        System.out.print(--c + " ");
        System.out.print(--d);
    }
}