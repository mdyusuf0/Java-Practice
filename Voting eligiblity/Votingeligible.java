//Input taken by User
import java.util.Scanner;

class Voting{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
//Using If-else condition
        if( age>= 18)
        {
            System.out.println("Person is eligible to vote");
        }
            else{
                System.out.println("Person is not eligible to vote");
            }
    }
}