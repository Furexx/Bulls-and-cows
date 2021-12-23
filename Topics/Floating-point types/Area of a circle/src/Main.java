import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double r = scanner.nextDouble();
        double area = (r*r)*Math.PI;
        System.out.println(area);
    }
}