import java.util.Scanner;
public class code
{
    public static int pins(int pin)
    {
        for (int i = 0, j = 3; i <= 3; i++, j--)
        {
            Scanner z=new Scanner(System.in);
            System.out.println("Enter your current pin:");
            int pin2 = z.nextInt();
            if (pin2 == pin)
            {
                for (int s = 0; s <= 35; s++)
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
        return pin;
    }
}
