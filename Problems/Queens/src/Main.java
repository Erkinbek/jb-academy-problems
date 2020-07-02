import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.next());
        int y1 = Integer.parseInt(scanner.next());
        int x2 = Integer.parseInt(scanner.next());
        int y2 = Integer.parseInt(scanner.next());
        if ((Math.abs(x1 - x2) == Math.abs(y1 - y2)) || (x1 == x2  || y1 == y2 )) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}