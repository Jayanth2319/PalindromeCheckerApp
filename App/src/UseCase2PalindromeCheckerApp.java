/**
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 *
 * This class checks whether a hardcoded string is a palindrome.
 *
 * Goal:
 * - Display whether a hardcoded string is a palindrome
 *
 * Flow:
 * 1. Program starts
 * 2. Hardcoded string is checked
 * 3. Result is printed
 * 4. Program exits
 *
 * Key Concepts:
 * - Class: Container for program logic
 * - Main Method: Entry point
 * - Static Keyword: Allows JVM to call main without creating an object
 * - String: Stores text
 * - Conditional Statement (if-else): Checks palindrome
 * - Console Output: Displays results
 *
 * Data Structure: String
 *
 * Author: Jayanth
 * Version: 1.0
 */
public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {
        // Hardcoded string
        String word = "madam";

        // Convert to lowercase to ignore case
        String lowerWord = word.toLowerCase();

        // Check palindrome
        boolean isPalindrome = true;
        int left = 0;
        int right = lowerWord.length() - 1;

        while (left < right) {
            if (lowerWord.charAt(left) != lowerWord.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a palindrome!");
        } else {
            System.out.println("\"" + word + "\" is NOT a palindrome!");
        }
    }
}