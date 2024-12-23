/*Replace Character
Input:
"GOOGLE IS DOODLE OF COOLER" Replace O with U
Output:
GUUGLE IS DUUDLE UF CUULER  */

// string declare
// using replace method
// access character one by one
// traverse the string array

class ReplaceCharacter {
  public static void main(String[] args) {
    String str = "GOOGLE IS DOODLE OF COOLER";
    // replaced a character
    String str1 = str.replace('O', 'U');

    for (int i = 0; i < str1.length(); i++) {
      char ch = str1.charAt(i);
      System.out.print(ch);
    }
    System.out.println();
    // replace a word

    String strrr = "GOOGLE IS DOODLE OF COOLER";
    String str2 = strrr.replace("GOOGLE", "DRIVER");

    for (char nums : str2.toCharArray()) {
      System.out.print(nums);
    }

    System.out.println();
    // replace all

    String strr = "GOOGLE IS DOODLE OF COOLER";
    String str3 = strr.replaceAll("OO", "*");

    System.out.println(str3);
  }/* Replace Character
Input:
"GOOGLE IS DOODLE OF COOLER" Replace O with U
Output:
GUUGLE IS DUUDLE UF CUULER
*/

// Declare string
// Use replace method to replace characters
// Traverse the string and access characters one by one
// Replace a word
// Replace all occurrences of a pattern

class ReplaceCharacter {
    public static void main(String[] args) {
        // Initial string
        String str = "GOOGLE IS DOODLE OF COOLER";

        // Replace character 'O' with 'U'
        String str1 = str.replace('O', 'U');

        // Print the modified string
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            System.out.print(ch);
        }
        System.out.println(); // To move to the next line after printing

        // Replace word "GOOGLE" with "DRIVER"
        String strrr = "GOOGLE IS DOODLE OF COOLER";
        String str2 = strrr.replace("GOOGLE", "DRIVER");

        // Print the modified string after word replacement
        for (char nums : str2.toCharArray()) {
            System.out.print(nums);
        }
        System.out.println(); // To move to the next line after printing

        // Replace all occurrences of "OO" with "*"
        String strr = "GOOGLE IS DOODLE OF COOLER";
        String str3 = strr.replaceAll("OO", "*");

        // Print the string after replacing "OO" with "*"
        System.out.println(str3);
    }
}

}



