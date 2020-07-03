import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            for (int g = 1; g <= i; g++ ) {
                if (counter >= n) break;
                System.out.print(i + " ");
                counter++;
            }
        }
    }
}