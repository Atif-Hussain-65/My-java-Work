import java.util.Scanner;
public class cash
{
    public static long ch(long safe, String name, String region, String cnic, String religion)
    {
        Scanner z = new Scanner(System.in);
        System.out.println("a.Current account");
        System.out.println("b.Saving account");
        System.out.println("c.Default");
        System.out.println("Enter option a,b,c:");
        String choice1;
        choice1 = z.next().toLowerCase();
        if (choice1.equals("a") || choice1.equals("b") || choice1.equals("c"))
        {
            System.out.println("a.5000\t\tb.10000\nc.25000\t\td.other amount");
            System.out.println("Enter option a,b,c,d:");
            String choice2;
            choice2 = z.next().toLowerCase();
            if (choice2.equals("a"))
            {
                if (safe >= 5000)
                {
                    System.out.println("Your cash is processing");
                    safe = safe - 5000;
                    System.out.println("Done \nTake your card\nTake your cash");
                    String rep;
                    System.out.println("a.Optional receipt\t\tb.Exit");
                    rep = z.next().toLowerCase();
                    if (rep.equals("a"))
                    {
                        report.rep(name, region, cnic, religion, safe);
                    }
                    else if (rep.equals("b"))
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
            else if (choice2.equals("b"))
            {
                if (safe >= 10000)
                {
                    System.out.println("Your cash is processing");
                    safe = safe - 10000;
                    System.out.println("Done \nTake your card\nTake your cash");
                    String rep;
                    System.out.println("a.Optional receipt\t\tb.Exit");
                    rep = z.next().toLowerCase();
                    if (rep.equals("a"))
                    {
                        report.rep(name, region, cnic, religion, safe);
                    }
                    else if (rep.equals("b"))
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
            else if (choice2.equals("c"))
            {
                if (safe >= 25000)
                {
                    System.out.println("Your cash is processing");
                    safe = safe - 25000;
                    System.out.println("Done \nTake your card\nTake your cash");
                    String rep;
                    System.out.println("a.Optional receipt\t\tb.Exit");
                    rep = z.next().toLowerCase();
                    if (rep.equals("a"))
                    {
                        report.rep(name, region, cnic, religion, safe);
                    }
                    else if (rep.equals("b"))
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
            else if (choice2.equals("d"))
            {
                System.out.println("Enter the amount you want to withdraw");
                int o;
                o = z.nextInt();
                if (safe >= o)
                {
                    System.out.println("Your cash is processing");
                    safe = safe - o;
                    System.out.println("Done \nTake your card\nTake your cash");
                    String rep;
                    System.out.println("a.Optional receipt\t\tb.Exit");
                    rep = z.next().toLowerCase();
                    if (rep.equals("a"))
                    {
                        report.rep(name, region, cnic, religion, safe);
                    }
                    else if (rep.equals("b"))
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
        }
        return safe;
    }
}
