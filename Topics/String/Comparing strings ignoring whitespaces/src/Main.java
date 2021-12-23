import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
       String a = first.replaceAll(" ","");
       String b = second.replaceAll(" ","");
        if (a.equals(b)){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}