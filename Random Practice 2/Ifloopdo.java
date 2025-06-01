public class Ifloopdo
{
    public static void main(String[] args)
    {
    int  a=11;
        if(a>0 && a<22)
        {
            do
            {
                System.out.println("printing using if nest do while");
                a++;
            }
            while(a>15); // condition is false in do while but will be printed once
        }
    }
}
