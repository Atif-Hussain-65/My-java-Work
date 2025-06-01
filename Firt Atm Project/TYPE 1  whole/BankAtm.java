import java.util.Scanner;
public class BankAtm
{
    public static void main(String[] args)
    {
        Scanner z = new Scanner(System.in);
        int pin;
        String ch, name, region, cnic, religion;
        long cni;
        System.out.println("Hi Welcome to Bank\nFollow the following steps to sign up for your account ");
        System.out.println("Enter your name");
        name = z.nextLine().toUpperCase();
        System.out.println("Enter your CNIC Number");
        cnic = z.nextLine();
        System.out.println("Enter your province");
        region = z.nextLine();
        System.out.println("Enter your religion");
        religion = z.nextLine().toUpperCase();
        System.out.println("YOUR ACCOUNT HAS BEEN CREATED\nEnter the 4 digit pin for your ATM card");
        pin = z.nextInt();
        System.out.println("Your ATM card is ready");
        System.out.println("Your account balance is zero\nEnter the amount you want to deposit in bank safe");
        long safe = z.nextLong();
        System.out.println("YOU ARE ALL DONE");
        System.out.println("ATM CARD is usable now.");
        System.out.println("would you like to use (ATM) or (leave)");
        ch = z.next().toUpperCase();
        if (ch.equals("ATM"))
        {
            System.out.println("Please insert your card");
            System.out.println("Welcome " + name );
            for (int i = 0, j = 3; i <= 3; i++, j--)
            {
                System.out.println("Please Enter Your Verification pin");
                int pin1 = z.nextInt();
                if (pin1 == pin)
                {
                    System.out.println("verification complete");
                    break;
                }
                else
                {
                    System.out.println("Wrong pin enter again attempt left " + j);
                }
            }
            for (int k = 0; k <= 50; k++)
            {
                System.out.println("\n\nEnter choice a,b,c,d,e form given options");
                System.out.println("a.Cash withdraw\t\tb.mini statement\nc.bill payment\t\td.send money to other bank account");
                System.out.println("e.change pin\t\tf.exit");
                System.out.println("Enter option a,b,c,d,e,f:");
                String choice;
                choice = z.next().toLowerCase();
                if (choice.equals("a"))
                {
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
                                    System.out.println("\n\nNAME:" + name + "\t\tREGION:" + region + "\nRemainig balance is: " + safe);
                                    System.out.println("CNIC:" + cnic + "\t\tReligion:" + religion + "\nThanks for coming");
                                }
                                else if (rep.equals("b"))
                                {
                                    System.out.println("Thank for coming,,Good bye.");
                                }
                                else
                                {
                                    System.out.println("Good bye anyway");
                                }
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
                                    System.out.println("\n\nNAME:" + name + "\t\tREGION:" + region + "\nRemainig balance is: " + safe);
                                    System.out.println("CNIC:" + cnic + "\t\tReligion:" + religion + "\nThanks for coming");
                                }
                                else if (rep.equals("b"))
                                {
                                    System.out.println("Thank for coming,,Good bye.");
                                }
                                else
                                {
                                    System.out.println("Good bye anyway");
                                }
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
                                    System.out.println("\n\nNAME:" + name + "\t\tREGION:" + region + "\nRemainig balance is: " + safe);
                                    System.out.println("CNIC:" + cnic + "\t\tReligion:" + religion + "\nThanks for coming");
                                }
                                else if (rep.equals("b"))
                                {
                                    System.out.println("Thank for coming,,Good bye.");
                                }
                                else
                                {
                                    System.out.println("Good bye anyway");
                                }
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
                                    System.out.println("\n\nNAME:" + name + "\t\tREGION:" + region + "\nRemainig balance is: " + safe);
                                    System.out.println("CNIC:" + cnic + "\t\tReligion:" + religion + "\nThanks for coming");
                                }
                                else if (rep.equals("b"))
                                {
                                    System.out.println("Thank for coming,,Good bye.");
                                }
                                else
                                {
                                    System.out.println("Good bye anyway");
                                }
                            }
                            else
                            {
                                System.out.println("Your account balance is not enough");
                            }
                        }
                    }
                }
                else if (choice.equals("b"))
                {
                    System.out.println("\t\tMINI STATEMENT:");
                    System.out.println("\n\nNAME:" + name + "\t\tREGION:" + region + "\nRemainig balance is: " + safe);
                    System.out.println("CNIC:" + cnic + "\t\tReligion:" + religion + "\nThanks for coming");
                }
                else if (choice.equals("c"))
                {
                    System.out.println("Bill Payment:>\na.Electric bill\t\tb.Ptcl bill");
                    System.out.println("c.Gas bill\nEnter the option a,b,c:");
                    String choice3;
                    choice3=z.next().toLowerCase();
                    if (choice3.equals("a"))
                    {
                        System.out.println("Electric Bill Payment");
                        System.out.println("Enter the bill amount");
                        int b = z.nextInt();
                        if (safe >= b)
                        {
                            System.out.println("Enter the CNIC");
                            cni=z.nextLong();
                            System.out.println("The Bill " + b + " payed for CNIC " + cni + " THANK YOU");
                            safe = safe - b;
                            System.out.println("a.Optional receipt\t\tb.Exit");
                            String rep1=z.next().toLowerCase();
                            if (rep1.equals("a"))
                            {
                                System.out.println("\n\nNAME:" + name + "\t\tREGION:" + region + "\nRemainig balance is: " + safe);
                                System.out.println("CNIC:" + cnic + "\t\tReligion:" + religion + "\nThanks for coming");
                            }
                            else if (rep1.equals("b"))
                            {
                                System.out.println("Thank for coming,,Good bye.");
                            }
                            else
                            {
                                System.out.println("Good bye anyway");
                            }
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
                            cni=z.nextLong();
                            System.out.println("The Bill " + c + " payed for CNIC " + cni+ " THANK YOU");
                            safe = safe - c;
                            System.out.println("a.Optional receipt\t\tb.Exit");
                            String rep2 = z.next().toLowerCase();
                            if (rep2.equals("a"))
                            {
                                System.out.println("\n\nNAME:" + name + "\t\tREGION:" + region + "\nRemainig balance is: " + safe);
                                System.out.println("CNIC:" + cnic + "\t\tReligion:" + religion + "\nThanks for coming");
                            }
                            else if (rep2.equals("b"))
                            {
                                System.out.println("Thank for coming,,Good bye.");
                            }
                            else
                            {
                                System.out.println("Good bye anyway");
                            }
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
                            cni=z.nextLong();
                            System.out.println("The Bill " + d + " payed for CNIC " + cni+ " THANK YOU");
                            safe = safe - d;
                            System.out.println("a.Optional receipt\t\tb.Exit");
                            String rep3 = z.next().toLowerCase();
                            if (rep3.equals("a"))
                            {
                                System.out.println("\n\nNAME:" + name + "\t\tREGION:" + region + "\nRemainig balance is: " + safe);
                                System.out.println("CNIC:" + cnic + "\t\tReligion:" + religion + "\nThanks for coming");
                            }
                            else if (rep3.equals("b"))
                            {
                                System.out.println("Thank for coming,,Good bye.");
                            }
                            else
                            {
                                System.out.println("Good bye anyway");
                            }
                        }
                        else
                        {
                            System.out.println("Your account balance is not enough");
                        }
                    }
                }
                else if (choice.equals("d"))
                {
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
                            System.out.println("\n\nNAME:" + name + "\t\tREGION:" + region + "\nRemainig balance is: " + safe);
                            System.out.println("CNIC:" + cnic + "\t\tReligion:" + religion + "\nThanks for coming");
                        }
                        else if (rep4.equals("b"))
                        {
                            System.out.println("Thank for coming,,Good bye.");
                        }
                        else
                        {
                            System.out.println("Good bye anyway");
                        }
                    }
                    else
                    {
                        System.out.println("Your account balance is not enough");
                    }
                }
                else if (choice.equals("e"))
                {
                    System.out.println("Change Pin:");
                    for (int i = 0, j = 3; i <= 3; i++, j--)
                    {
                        System.out.println("Enter your current pin:");
                        int pin2 = z.nextInt();
                        if (pin2 == pin)
                        {

                            for (int s = 0; s <= 3; s++)
                            {
                                System.out.println("Enter your new pin");
                                int pin3 = z.nextInt();
                                System.out.println("Confirm your new pin");
                                int pin4 = z.nextInt();
                                if (pin3 == pin4)
                                {

                                    System.out.println("Done PIN CHANGED SUCCESSFULLY");
                                    pin = pin4;
                                    break;
                                }
                                else
                                {
                                    System.out.println("PIN Did Not Match Enter again");
                                }
                            }
                            break;
                        }
                        else
                        {
                            System.out.println("Wrong pin enter again attempt left " + j);
                        }
                    }
                }
                else if
                (choice.equals("f"))
                {
                    System.out.println("Farewell");
                    break;
                }
            }
        }
        else if (ch.equals("LEAVE"))
        {
            System.out.println("Good bye");
        }
        else
        {
            System.out.println("legendary input cant handle");
        }
    }
}