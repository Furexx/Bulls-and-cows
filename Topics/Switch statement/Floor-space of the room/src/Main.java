import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String room = scanner.nextLine();
        switch (room) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double p = (a + b + c) / 2;
                System.out.println( Math.sqrt(p * (p - a) * (p - b) * (p - c)));

                break;
            case "rectangle":
                double d = scanner.nextInt();
                double g = scanner.nextInt();
                System.out.println(d*g);
                break;
            case "circle":
                double r = scanner.nextInt();
                System.out.println(3.14*r*r);
                break;
        }
    }
}