import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Deque<Character> deque = new LinkedList<>();

        for(char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }
}

// Main Application
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "racecar";

        // Choose strategy
        PalindromeStrategy strategy = new DequeStrategy();
        // PalindromeStrategy strategy = new StackStrategy();

        if(strategy.checkPalindrome(word)) {
            System.out.println("The word \"" + word + "\" is a Palindrome");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome");
        }
    }
}