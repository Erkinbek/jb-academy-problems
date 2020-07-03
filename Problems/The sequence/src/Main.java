import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0, a;
        while (scanner.hasNext()) {
            a = scanner.nextInt();
            if (a % 4 == 0) {
                if (a > max) {
                    max = a;
                }
            }
        }
        System.out.println(max);
    }
}