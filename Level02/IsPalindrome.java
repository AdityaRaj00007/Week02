import java.util.Scanner;
class PalindromeChecker {
    String text; 
 // Constructor to initialize the string
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the string is a palindrome
    boolean checkPalindrone() {
        int start = 0; // Pointer starting from the beginning
        int end = text.length() - 1; // Pointer starting from the end

        // Compare characters from both ends of the string
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) { 
                // If mismatch is found, it's not a palindrome
                return false;
            }
            start++; // Move start pointer forward
            end--;   // Move end pointer backward
        }
        return true;
    }

    // Method to display whether the string is a palindrome
    void display() {
        System.out.println("The String \"" + text + "\" is Palindrome: " + checkPalindrone());
    }
}

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String text = input.next();

        // Create a PalindromeChecker object and display the result
        PalindromeChecker palindromeChecker = new PalindromeChecker(text);
        palindromeChecker.display();

        input.close(); 
    }
}
