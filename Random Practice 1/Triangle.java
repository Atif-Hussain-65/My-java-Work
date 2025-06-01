import java.util.Scanner;

public class Triangle
{
    public static void area()
    {
        Scanner si=new Scanner(System.in);
        System.out.println("Enter the base and height of triangle");
        double b,h,c;
        b=si.nextInt();
        h=si.nextInt();
        c=cal(b,h);
        System.out.println("Area of triangle is :"+c);
    }
    public static double cal(double a,double b)
    {
        return ((a*b)/2);
    }
}
