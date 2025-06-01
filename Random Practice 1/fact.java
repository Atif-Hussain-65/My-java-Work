public class fact
{
    public static long factorial(long n)

    {
        long i,f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}