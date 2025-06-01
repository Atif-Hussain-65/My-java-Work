import java.util.Scanner;

public class send
{
    public static long money(String name, String region, String cnic, String religion, long safe)
    {
        Scanner z = new Scanner(System.in);
        System.out.println("Send money to another Account:");
        System.out.println("Enter the account number");
        long acc = z.nextLong();
        System.out.println("Enter the amount:");
        int f = z.nextInt();
        System.out.println("Processing");
        if (safe >= f)
        {
            System.out.println("THE AMOUNT " + f + " sent to account number " + acc);
            safe = safe - f;
            System.out.println("a.Optional receipt\t\tb.Exit");
            String rep4 = z.next().toLowerCase();
            if (rep4.equals("a"))
            {
                report.rep(name, region, cnic, religion, safe);
            }
            else if (rep4.equals("b"))
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
    return safe;
    }
}