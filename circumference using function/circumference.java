import java.util.Scanner;
class circumference{
public static double formula(int r)
{
return 2*3.14*r;
}

public static void main(String...a)
{

Scanner radius = new Scanner(System.in);
System.out.println("Enter the length of radius in meter");
int r=radius.nextInt();
double output=formula(r);
System.out.println("Circumference is: " + output + " meter");
}
}
