import java.util.Scanner;

class Square{
public static int square(int s){
   
   return s*s;
   }
   
   public static void main(String [] args)
   {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter any Number");
	   int input= sc.nextInt();
	 
	   
   System.out.println("The Square of given Number is :" + square(input));
   }
      }