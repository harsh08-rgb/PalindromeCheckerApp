import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();


        PalindromeService service = new PalindromeService();


        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}


class PalindromeService {

    public boolean checkPalindrome(String input) {


        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        int start = 0;
        int end = input.length() - 1;


        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}