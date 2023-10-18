public class Palindrome {
    // Function to check if a string is a palindrome using recursion
    static boolean isPalindrome(String str) {
        // Base case: If the string is empty or has only one character, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }
        
        // Compare the first and last characters of the string
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // If they match, check the substring between the first and last characters
            // by recursively calling isPalindrome on the substring
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        
        // If the first and last characters don't match, the string is not a palindrome
        return false;
    }

    public static void main(String[] args) {
        String str = "racecar"; // Change this string as needed

        if (isPalindrome(str)) {
            System.out.print("Yes, it's a palindrome.");
        } else {
            System.out.print("No, it's not a palindrome.");
        }
    }
}
