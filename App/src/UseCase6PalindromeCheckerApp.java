import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("UC6: Queue + Stack Based Palindrome Check");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        Queue<Character> queue = new LinkedList<>(); // FIFO
        Stack<Character> stack = new Stack<>();      // LIFO

        // Enqueue and push characters
        for (char c : input.toCharArray()) {
            queue.add(c);  // enqueue
            stack.push(c); // push
        }

        // Compare dequeue vs pop
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}