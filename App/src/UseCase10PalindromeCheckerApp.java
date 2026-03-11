public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Nurses Run";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // Reverse the normalized string
        for(int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Compare strings
        if(normalized.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome (ignoring spaces and case)");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome");
        }
    }
}