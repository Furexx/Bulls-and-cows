import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;


            do {
                if (Math.sqrt(a) % 1 == 0) {
                System.out.println(a);}
                ++a;
            } while (a <= n);


    }
}