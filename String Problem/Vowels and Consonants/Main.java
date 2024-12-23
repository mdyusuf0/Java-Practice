// declare string
//change to upper/lower case 
//convert it into char array
//traverse
//Check only alphabetic characters(to avoid counting space and comma as consonant)
//apply condition
//return output


class Main {
    public static void main(String[] args) {
        String str = "Every time he closed his eyes, he remembered the moment like it was yesterday.";

        // Convert string to lowercase
        String Lower = str.toLowerCase();
        
        // Initialize counters for vowels and consonants
        int count1 = 0; // Vowels
        int count2 = 0; // Consonants

        // Iterate through each character in the string
        for (char trav : Lower.toCharArray()) {

            // Check if the character is alphabetic
            if (Character.isAlphabetic(trav)) {
                // Check if the character is a vowel
                if (trav == 'a' || trav == 'e' || trav == 'u' || trav == 'o' || trav == 'i') {
                    count1++; // Increment vowel counter
                } else {
                    count2++; // Increment consonant counter
                }
            }
        }

        // Print the results
        System.out.println("Vowels : " + count1); 
        System.out.println("Consonants : " + count2); 
    }
}
