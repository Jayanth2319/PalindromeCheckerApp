import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("UC5: Stack-Based Palindrome Checker");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Use a stack to reverse characters
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c); // push characters into stack
        }

        // Pop characters and compare
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}