import java.util.Scanner;

public class Diffdatatype
{
    public static void main(String[] args)
    {
        Scanner si=new Scanner(System.in);
        System.out.println("Enter the number of days");
        byte days=si.nextByte();
        System.out.println("A.To find the hours\tB.To find the minutes");
        System.out.println("C.to find the seconds");
        String choice=si.next().toLowerCase();
       choicex.stateif(choice,days);

    }
}
