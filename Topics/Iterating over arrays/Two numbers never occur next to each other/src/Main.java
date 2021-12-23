import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean check = true;
        for (int i = 0; i < arr.length-1 ; i++) {
            if ((arr[i] == n && arr[i+1] == m) ||
            (arr[i] == m && arr[i+1] == n)){
                check = false;
                break;
            }

        }
        System.out.println(check);
    }
}