import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, sum = 0;
        while (scanner.hasNext()) {
            a = scanner.nextInt();
            sum = sum + a;
            if (a == 0) break;
        }
        System.out.println(sum);
    }
}