public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";   // original string
        String reversed = "";

        // reverse the string using loop
        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // compare original and reversed
        if(word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a Palindrome");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome");
        }
    }
}