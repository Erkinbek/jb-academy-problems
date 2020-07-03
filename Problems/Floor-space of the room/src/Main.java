import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        calculateByType(type, scanner);
    }

    public static void calculateByType(String type, Scanner scanner)
    {
        switch (type) {
            case "triangle" : calculateTriangle(scanner); break;
            case "rectangle" : calculateRectangle(scanner); break;
            case "circle" : calculateCircle(scanner); break;
        }
    }

    public static void calculateTriangle(Scanner scanner)
    {
        double a,b,c,S,res;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        S = (a + b + c) / 2;
        res = Math.pow(S * (S - a) * (S - b) * (S - c), 0.5);
        System.out.println(res);
    }

    public static void calculateRectangle(Scanner scanner)
    {
        double a,b;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.println(a * b);
    }

    public static void calculateCircle(Scanner scanner)
    {
        double r;
        r = scanner.nextDouble();
        System.out.println(3.14 * r * r);
    }
}