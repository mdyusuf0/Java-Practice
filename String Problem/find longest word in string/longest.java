/* Find Longest Word
Input:
The quick brown fox jumps over the lazy dog
Output:
Longest word: jumps (length: 5)
*/

// Declare string
// Split string word by word
// Traverse and iterate through the string array
// Find the largest word
// Print the largest word

class longest {
    public static void main(String[] args) {
        // Input string
        String str = "The quick brown fox jumps over the lazy dog";

        // Split the string into words
        String[] splited = str.split(" ");
        
        // Variable to store the longest word
        String longestWord = "";

        // Iterate through the words
        for (String word : splited) {
            // If the current word is longer than the previous longest word
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Print the longest word and its length
        System.out.println("Longest word: " + longestWord + " (length: " + longestWord.length() + ")");
    }
}
