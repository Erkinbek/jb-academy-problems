import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        int k = Integer.parseInt(scanner.next());
        if (k >= m && k >= n) {
            if (k <= m * n) {
                if ((k % n == 0) || (k % m == 0)) {
                    System.out.print("YES");
                } else {
                    System.out.print("NO");
                }
            } else {
                System.out.print("NO");
            }
        } else {
            System.out.print("NO");
        }
    }
}