class Main {
    public static void main(String[] args) {
        String str = "NAMYAX";

        // Convert string to char array
        char[] chars = str.toCharArray();
        
        // Flag to check if the string is a palindrome
        boolean var = true;

        // Traverse the string array from both ends
        for (int I = 0; I < chars.length / 2; I++) {
            // Compare characters from front and back
            char front = chars[I];
            char back = chars[chars.length - I - 1];

            // If the characters are not the same, set var to false
            if (front != back) {
                var = false;
                break;  // Exit the loop early if a mismatch is found
            }
        }

        // Print if the string is a palindrome
        if (var) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
