import java.util.Scanner;

public class Square
{
    public static void area()
    {
        Scanner si=new Scanner(System.in);
        System.out.println("Enter the length of one side of square");
        int l,c;
        l= si.nextInt();
        c=cal(l);
        System.out.println("Area of square is :"+c);
    }
    public static int cal(int a)
    {
        return (a*a);
    }
}

