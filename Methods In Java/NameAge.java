import java.util.Scanner;

public class NameAge
{
    static Scanner si=new Scanner(System.in);
    public static void main(String[] args)
    {
        String name=name();
        int age=age();
        boolean choice=choice(age);
        show(choice);
    }
    public static String name()
    {
        System.out.println("Enter your name:");
        String nam=si.nextLine().toUpperCase();
        return nam;
    }
    public static int age()
    {
        System.out.println("Enter your age:");
        int agee= si.nextInt();
        return agee;
    }
    public static boolean choice(int age)
    {
        if(age>=18 && age<=20)
        {
            return true;
        }
        else return false;
    }
    public static void show(boolean a)
    {
        if(a)
        {
            System.out.println("You are eligible for admission");
        }
        else System.out.println("You are not eligible");
    }
}
