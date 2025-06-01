import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner z = new Scanner(System.in);
        int a;
        System.out.println("Enter the number\n");
        a = z.nextInt();
        System.out.println("from if \n");
        if (a > 0)
        {
            System.out.println(a+" is positive");
        }
        else if (a < 0)
        {
            System.out.println(a+" is negative");
        }
        else
        {
            System.out.println(a+" is a zero");
        }
        System.out.println("\nfrom switch\n");
        switch(a)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            {
                System.out.println(a+" is positive");
            break;
            }
            default:
            {
                System.out.println("i have limited range of case/conditions");
                System.out.println("the number is either zero or less or greater then my range");
            }
        }

    }
}