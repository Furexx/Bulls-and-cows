import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x1 = ((-b) + Math.sqrt((b*b) - (4*a*c))) / (2*a);
        double x2 = ((-b) - Math.sqrt((b*b) - (4*a*c))) / (2*a);
        System.out.print(Math.min(x1,x2) + " ");

        System.out.print(Math.max(x1,x2));
    }
}