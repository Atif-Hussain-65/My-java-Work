import java.util.Scanner;
public class switchgrade
{
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        int num,a;
        System.out.println("Enter the marks");
        num= z.nextInt();
        if(num<=100 && num>=90)
        {
            a=1;
        }
        else if (num<90 && num >=80)
        {
            a=2;
        }
        else if(num <80 && num >=70)
        {
            a=3;
        }
        else if(num <70 && num >=60)
        {
            a=4;
        }
        else if(num <60 && num >=50)
        {
            a=5;
        }
        else if(num<50 && num >=0)
        {
            a=6;
        }
        else
        {
            a=0;
        }
        switch(a)
        {
            case 1:
                System.out.println("A+ garde.outstanding");
                break;
            case 2:
                System.out.println("A grade.excellent");
                break;
            case 3:
                System.out.println("B grade.very good");
                break;
            case 4:
                System.out.println("C garde.good");
                break;
            case 5:
                System.out.println("D grade.fair");
                break;
            case 6:
                System.out.println("F garde.fail");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
