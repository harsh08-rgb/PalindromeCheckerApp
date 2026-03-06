import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();


        PalindromeStrategy strategy = new StackStrategy();


        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}


interface PalindromeStrategy {

    boolean check(String input);
}



class StackStrategy implements PalindromeStrategy {


    public boolean check(String input) {


        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        java.util.Stack<Character> stack = new java.util.Stack<>();


        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}