import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double p = (double) (a + b + c) / 2;
        double h = p * (p-a)*(p-b)*(p-c);
        double area = Math.sqrt(h);
        System.out.println(area);
    }
}