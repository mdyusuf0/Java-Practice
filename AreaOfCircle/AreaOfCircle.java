import java.util.Scanner;
class AreaOfCircle{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Radius of circle;");
        float Radius = scanner.nextFloat();

        double Area= 3.142*Radius*Radius;
        System.out.println("Area Of Circle is;" + Area);
    }
}