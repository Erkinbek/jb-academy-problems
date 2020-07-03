import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i ++) {
            if ( i*i > n) break;
            System.out.println(i*i);
        }
    }
}