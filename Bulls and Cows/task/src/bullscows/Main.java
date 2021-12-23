package bullscows;

import java.util.*;

public class Main {
    private static int turn = 0;

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Input the length of the secret code:");
        int l = 0;
        try {
            l = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.printf("Error: %d isn't a valid number.",l);
            System.exit(0);
        }
        if(l == 0) {
            System.out.printf("Error: can't generate a secret number with a length of %d .", l);
            System.exit(0);
        }
        System.out.println("Input the number of possible symbols in the code:");
        int p = 0;
        try {
             p = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.printf("Error: %d isn't a valid number.",p);
            System.exit(0);
        }

        if (p>36){
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            System.exit(0);
        }

        String ss = "0123456789abcdefghijklmnopqrstuvwxyz";
        String secret = extractAlphaRandom(ss, l, p);
        System.out.print("The secret is prepared: ");
        for(int k = 0; k<l; k++){
            System.out.print("*");
        }
        System.out.print(" ");
        System.out.print(p<=10?"(0-"+ss.charAt(p-1)+")":"(0-9, a-"+ss.charAt(p-1)+")");
        System.out.println("\nOkay, let's start a game!");
        grade(secret, l);
    }

    private static String extractAlphaRandom(String ss, int l, int p) {

            String s = ss.substring(0, p);
            List<String> code = new ArrayList<>();
            for(char x : s.toCharArray()){
                code.add(String.valueOf(x));
            }
            Collections.shuffle(code, new Random());
            var c = new StringBuilder();//secret
            int i = 0;
        try {
            while (i < l) {
                c.append(code.get(i));
                i++;
            }


        } catch (IndexOutOfBoundsException e) {
            System.out.printf("Error: it's not possible to generate a code with a length of %d with %d unique symbols.",l,p);
            System.exit(0);
        }


            return c.toString();

    }


    private static void grade(String code, int n) {
        System.out.printf("Turn %d:",++turn);
        var sc = new Scanner(System.in);
        String userCode = sc.nextLine();
        int cow = 0;
        int bull = 0;
        for(int i = 0; i < userCode.length(); i++){
            if(code.charAt(i) == userCode.charAt(i)){
                bull++;
            }else if(code.contains(""+ userCode.charAt(i))){
                cow++;
            }
        }
        if(bull == n){
            System.out.println("Grade: "+bull+(bull>1?" bulls":" bull"));
            System.out.println("Congratulations! You guessed the secret code.");
        }else{
            String c = cow == 0?"":cow==1?cow+" cow":cow+" cows";
            String b = bull == 0?"":bull==1?bull+" bull":bull+" bulls";
            if(bull == 0 && cow == 0){
                System.out.println("None");
            }else{
                System.out.println("Grade: "+b+(cow>0 && bull>0?" and ":"")+c);
            }
            grade(code, n);
        }
    }
}