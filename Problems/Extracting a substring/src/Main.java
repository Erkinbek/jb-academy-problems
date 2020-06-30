import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = Integer.parseInt(sc.next());
        int end = Integer.parseInt(sc.next());
        System.out.print(str.substring(start, ++end));
    }
}