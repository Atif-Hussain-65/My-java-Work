import java.util.Scanner;

public class Circle
{
    public static void area()
    {
        Scanner si=new Scanner(System.in);
        double r,c;
        System.out.println("Enter the radius of circle");
        r=si.nextDouble();
        c=cal(r);
        System.out.println("Area of circle is :"+c);
    }
    public static double cal(double a)
    {
        double b=(3.14*a*a);
        return b;
    }
}
