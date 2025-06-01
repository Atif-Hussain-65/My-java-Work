import java.util.Scanner;

public class Sportcarinfo
{
    public static void alpine()
    {
        Scanner si=new Scanner(System.in);
        System.out.print("\tALPINE A110\nColour:MERCURY SILVER");
        System.out.print("\tCars left: 3\nSpeed: 155 mph");
        System.out.println("\tPrice :24,433,547 RS only");
        System.out.println("Wanna buy ;yes or no");
        String choice= si.next().toLowerCase();
        if (choice.equals("yes"))
        {
            System.out.println("Very well complete the payment.checkout more");
        }
        else if (choice.equals("no")){
            System.out.println("okay check out others");
        }else System.out.println("input incorrect");
    }
    public static void porsche()
    {
        Scanner si=new Scanner(System.in);
        System.out.print("\tPORSCHE 718\nColour:RUBY RED");
        System.out.print("\tCars left: 5\nSpeed: 188 mph");
        System.out.println("\tPrice :16,509,505 RS only");
        System.out.println("Wanna buy ;yes or no");
        String choice= si.next().toLowerCase();
        if (choice.equals("yes"))
        {
            System.out.println("Very well complete the payment.checkout more");
        }
        else if (choice.equals("no")){
            System.out.println("okay checkout others");
        }else System.out.println("input incorrect");
    }
    public static void mclaren(){
        Scanner si=new Scanner(System.in);
        System.out.print("\tMACLAREN 720S\nColour:ONYX BLACK");
        System.out.print("\tCars left: 2\nSpeed: 241 mph");
        System.out.println("\tPrice :80,854,914 RS only");
        System.out.println("Wanna buy ;yes or no");
        String choice= si.next().toLowerCase();
        if (choice.equals("yes"))
        {
            System.out.println("Very well complete the payment.checkout more");
        }
        else if (choice.equals("no")){
            System.out.println("okay checkout other");
        }else System.out.println("input incorrect");
    }
    public static void bugatti(){
        Scanner si=new Scanner(System.in);
        System.out.print("\tBUGATTI CHIRON\nColour:WHITE");
        System.out.print("\tCars left: 1\nSpeed: 304 mph");
        System.out.println("\tPrice :755,166,6770 RS only");
        System.out.println("Wanna buy ;yes or no");
        String choice= si.next().toLowerCase();
        if (choice.equals("yes"))
        {
            System.out.println("Very well complete the payment.check out more");
        }
        else if (choice.equals("no")){
            System.out.println("okay checkout other");
        }else System.out.println("input incorrect");
    }
}
