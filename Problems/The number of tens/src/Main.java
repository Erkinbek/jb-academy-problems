import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = (Integer.parseInt(scanner.next()) / 10) % 10;
        System.out.print(a);
    }
}