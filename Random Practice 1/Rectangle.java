import java.util.Scanner;

public class Rectangle
{
    public static void area()
    {
        Scanner si=new Scanner(System.in);
        System.out.println("Enter the length and width of rectangle");
        int l,w,c;
        l= si.nextInt();
        w=si.nextInt();
        c=cal(l,w);
        System.out.println("Area of rectangle is :"+c);
    }
    public static int cal(int a,int b)
    {
        return (a*b);
    }
}
