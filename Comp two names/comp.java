

import java.util.Scanner;

class comp {
    public static void main(String...a) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the number of strings for the first array:");
        int input1 = Sc.nextInt();
        Sc.nextLine();  // Consume the newline

        String[] array1 = new String[input1];

        for(int i = 0; i < input1; i++) {
            System.out.println("Enter String " + (i + 1) + ":");
            array1[i] = Sc.nextLine();
        }

        System.out.println("Enter the number of strings for the second array:");
        int input2 = Sc.nextInt();
        Sc.nextLine();  // Consume the newline

        String[] array2 = new String[input2];

        for(int j = 0; j < input2; j++) {
            System.out.println("Enter String " + (j + 1) + ":");
            array2[j] = Sc.nextLine();
        }

        // You can now process array1 and array2 as needed
    }
}
