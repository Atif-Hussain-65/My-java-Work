import java.util.Scanner;
public class BankAtms
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
        region = z.nextLine().toUpperCase();
        System.out.println("Enter your religion");
        religion = z.nextLine().toUpperCase();
        System.out.println("YOUR ACCOUNT HAS BEEN CREATED\nEnter the 4 digit pin for your ATM card");
        pin = z.nextInt();
        System.out.println("Your ATM card is ready");
        System.out.println("Your account balance is zero\nEnter the amount you want to deposit in bank safe");
        long safe = z.nextLong();
        System.out.println("YOU ARE ALL DONE");
        System.out.println("ATM CARD is usable now.");
        System.out.println("would you like to use (ATM)or (leave)");
        ch = z.next().toUpperCase();
        if (ch.equals("ATM"))
        {
            System.out.println("Please insert your card");
            System.out.println("Welcome " + name);
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
                  safe=  cash.ch(safe, name, region, cnic, religion);
                }
                else if (choice.equals("b"))
                {
                    System.out.println("\t\tMINI STATEMENT:");
                    report.rep(name, region, cnic, religion, safe);
                }
                else if (choice.equals("c"))
                {
                   safe= bill.payment(name,region,religion,cnic,safe);
                }
                else if (choice.equals("d"))
                {
                  safe=  send.money(name,region,cnic,religion,safe);
                }
                else if (choice.equals("e")) 
                {
                 pin=code.pins(pin);   
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