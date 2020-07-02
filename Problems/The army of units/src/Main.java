import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = Integer.parseInt(scanner.next());
        String res;
        if (a < 1) {
            res = "no army";
        } else if (a < 20) {
            res = "pack";
        } else if (a < 250) {
            res = "throng";
        } else if (a < 1000) {
            res = "zounds";
        } else {
            res = "legion";
        }
        System.out.print(res);
    }
}