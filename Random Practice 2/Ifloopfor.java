import java.util.Scanner;
public class Ifloopfor
{
    public static void main(String[] args)
    {
        Scanner z = new Scanner(System.in);
        int number, i;
        System.out.println("enter you marks");
        number= z.nextInt();
     if (number >79 && number<=100)
     {
         for (i=65;i<='E';i++)
         {
            System.out.println("well good marks chill");
         }
     }
     else if (number >49 && number<=79)
     {
         for (i=65;i<='D';i++)
         {
             System.out.println("hmm passed keep up");
         }
     }
     else if (number >0&&number<=49)
     {
         for (i=65;i<='C';i++)
         {
             System.out.println("huh you failed ");
         }
     }
     else
     {
         for (i=65;i<='B';i++)
         {
             System.out.println("legendary input cant handle");
         }
     }
    }

}
