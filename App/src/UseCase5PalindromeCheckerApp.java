import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for(int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to form reversed string
        String reversed = "";

        while(!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if(word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome");
        }
    }
}