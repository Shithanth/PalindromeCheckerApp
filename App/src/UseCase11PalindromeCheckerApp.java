class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String word) {

        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        return word.equals(reversed);
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        PalindromeChecker checker = new PalindromeChecker();

        if(checker.checkPalindrome(word)) {
            System.out.println("The word \"" + word + "\" is a Palindrome");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome");
        }
    }
}