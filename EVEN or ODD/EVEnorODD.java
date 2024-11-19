import java.util.Scanner;
class EVENorODD{
       public static void main(String[] args)
       {
         Scanner scanner = new Scanner(System.in);
         int a = scanner.nextInt();
         Sysytem.out.println("Enter a Number");

         if( a/2 == 0)
         { System.out.println("Number is Even");
        }

        else{
            System.out.println("Number is Odd");
        }

       }
}