import java.util.Scanner;

public class bill
{
    public static long payment(String name,String region,String religion,String cnic,long safe)
    {
        long cni;
        Scanner z=new Scanner(System.in);
        System.out.println("Bill Payment:>\na.Electric bill\t\tb.Ptcl bill");
        System.out.println("c.Gas bill\nEnter the option a,b,c:");
        String choice3;
        choice3 = z.next().toLowerCase();
        if (choice3.equals("a"))
        {
            System.out.println("Electric Bill Payment");
            System.out.println("Enter the bill amount");
            int b = z.nextInt();
            if (safe >= b)
            {
                System.out.println("Enter the CNIC");
                cni = z.nextLong();
                System.out.println("The Bill " + b + " payed for CNIC " + cni + " THANK YOU");
                safe = safe - b;
                System.out.println("a.Optional receipt\t\tb.Exit");
                String rep1 = z.next().toLowerCase();
                if (rep1.equals("a"))
                {
                    report.rep(name, region, cnic, religion, safe);
                }
                else if (rep1.equals("b"))
                {
                    System.out.println("Thank for coming,,Good bye.");
                }
                else
                {
                    System.out.println("Good bye anyway");
                }
                return safe;
            }
            else
            {
                System.out.println("Your account balance is not enough");
            }
        }
        else if (choice3.equals("b"))
        {
            System.out.println("Ptcl Bill Payment:");
            System.out.println("Enter the amount of bill");
            int c = z.nextInt();
            if (safe >= c)
            {
                System.out.println("Enter the CNIC");
                cni = z.nextLong();
                System.out.println("The Bill " + c + " payed for CNIC " + cni + " THANK YOU");
                safe = safe - c;
                System.out.println("a.Optional receipt\t\tb.Exit");
                String rep2 = z.next().toLowerCase();
                if (rep2.equals("a"))
                {
                    report.rep(name, region, cnic, religion, safe);
                }
                else if (rep2.equals("b"))
                {
                    System.out.println("Thank for coming,,Good bye.");
                }
                else
                {
                    System.out.println("Good bye anyway");
                }
                return safe;
            }
            else
            {
                System.out.println("Your account balance is not enough");
            }
        }
        else if (choice3.equals("c"))
        {
            System.out.println("Gas Bill Payment:");
            System.out.println("Enter the amount of bill");
            int d = z.nextInt();
            if (safe >= d)
            {
                System.out.println("Enter the CNIC");
                cni = z.nextLong();
                System.out.println("The Bill " + d + " payed for CNIC " + cni + " THANK YOU");
                safe = safe - d;
                System.out.println("a.Optional receipt\t\tb.Exit");
                String rep3 = z.next().toLowerCase();
                if (rep3.equals("a"))
                {
                    report.rep(name, region, cnic, religion, safe);
                }
                else if (rep3.equals("b"))
                {
                    System.out.println("Thank for coming,,Good bye.");
                }
                else
                {
                    System.out.println("Good bye anyway");
                }
                return safe;
            }
            else
            {
                System.out.println("Your account balance is not enough");
            }
        }
        return safe;
    }
}
