import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}