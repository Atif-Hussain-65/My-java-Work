import java.util.Scanner;
public class Multidatatype {
    public static void main(String[] args) {

        Scanner si=new Scanner(System.in);
        String name,brothername,compliment;
        int age,age1;
        System.out.println("Enter your name");
        name=si.nextLine().toUpperCase();
        System.out.println("Enter your brother name");
        brothername= si.nextLine().toUpperCase();
        System.out.println("Enter your age");
        age=si.nextInt();
        System.out.println("Enter your brother age");
        age1= si.nextInt();
        boolean check=tf(age,age1);
        if (check)
        {
            System.out.println("You are big brother of "+brothername);
        }
        if (!(check))
        {
            System.out.println(brothername+" is your big brother");
        }
        compliment=words(check);
        System.out.println(compliment);
    }
    public static boolean tf(int a,int b)
    {
        boolean c=(a>b);
        return c;
    }
    public static String words(boolean a)
    {
        String comment;
        if (a)
        {
            comment="You must take care of your little brother";
        }
        else
        {
            comment="You must respect your big brother";
        }
        return comment;
    }
}
