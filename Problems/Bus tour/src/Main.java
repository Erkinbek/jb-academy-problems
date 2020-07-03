import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b, height;
        boolean res = true;
        a = scanner.nextInt();
        b = scanner.nextInt();
        for (int i = 1; i <= b; i++) {
            height = scanner.nextInt();
            if (a >= height) {
                System.out.print("Will crash on bridge " + i);
                res = false;
                break;
            }
        }
        if (res) {
            System.out.print("Will not crash");
        }
    }
}