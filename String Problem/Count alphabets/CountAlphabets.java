class CountAlphabets {
    public static void main(String[] args) {
        String str = "In the previous Java string programs, we have counted the number of words white spaces, vowels";

        // Convert string to lowercase to handle case insensitivity
        String Lower_String = str.toLowerCase();

        // Loop through each character in the string
        for (char Traverse : Lower_String.toCharArray()) {
            int count = 0;

            // Count occurrences of the current character
            for (char Traverse2 : Lower_String.toCharArray()) {
                if (Traverse == Traverse2) {
                    count++;
                }
            }

            // Print the character and its count
            System.out.println(Traverse + ": " + count);
        }
    }
}
