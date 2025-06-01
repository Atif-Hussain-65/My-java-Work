import java.util.Scanner;
public class months
{
    public static void main(String[] args)
    {
        Scanner z = new Scanner(System.in);
        int month;
        System.out.println("Enter month number ");
        month = z.nextInt();
        System.out.println("from if\n");
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            System.out.println(31 + " days");
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.println(30 +"days");
        }
        else if(month==2)
        {
            System.out.println(28 +" or"+29+" days");
        }
        else
        {
            System.out.println("Invalid input");
        }
        //in this situation if require complex condition to solve a little
        //but in switch there is only one condition
        System.out.println("now in switch \n");
        switch (month)
        {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                {
                    System.out.println("31 days");
                    break;
                }
                case 2:
                {
                    System.out.println("28 or 29 days");
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11:
                {
                    System.out.println("30 days");
                    break;
                }
                default:
                {
                    System.out.println("Invalid input");
                    break;
                }
        }

    }
}
