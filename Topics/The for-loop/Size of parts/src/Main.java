import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int shipped = 0;
        int fixed = 0;
        int reject = 0;
        for (int i = 0; i < n ; i++) {
            int part = scanner.nextInt();
            if (part == 0){
                shipped++;
            }
            if (part == 1){
                fixed++;
            }
            if (part == -1){
                reject++;
            }
        }
        System.out.println(shipped + " " + fixed + " " + reject);
    }
}