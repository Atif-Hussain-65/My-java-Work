import java.util.Scanner;

public class Callinsame1
{
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        System.out.println("Welcome to Hospital");
        System.out.println("what is your name");
        String name= z.nextLine().toUpperCase();
        System.out.println("What is your age");
        int age= z.nextInt();
        report(name,age);
    }
    public static void report(String a,int b)
    {
        System.out.println("\nName :"+a+"\tAge :"+b);
        turn(b);
        System.out.println("Wait for your turn have patience");
        System.out.println("Take your seat");
    }
    public static void turn(int a)
    {
        a=a*2;
        System.out.println("Patient Number :"+a);
    }
}
