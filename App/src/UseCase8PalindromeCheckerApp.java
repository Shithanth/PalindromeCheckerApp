public class UseCase8PalindromeCheckerApp {

    // Node class for linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String word = "madam";

        // Create linked list from string
        Node head = null, tail = null;

        for(char c : word.toCharArray()) {
            Node newNode = new Node(c);
            if(head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Find middle using fast and slow pointer
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        Node curr = slow;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare halves
        Node firstHalf = head;
        Node secondHalf = prev;

        boolean isPalindrome = true;

        while(secondHalf != null) {
            if(firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        if(isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome");
        }
    }
}