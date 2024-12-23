         import java.util.Scanner;

class product{

    public static int calculateproduct(int x,int y){        // function defining
        return x+y;
    }
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
System.out.print("Enter first number:");                        //user input
        int x= sc.nextInt();
System.out.print("Enter second number:");
        int y = sc.nextInt();



        int multiply = calculateproduct(x,y);                    //function calling
        System.out.println("Sum of two num is:" + multiply);
       
    }
}