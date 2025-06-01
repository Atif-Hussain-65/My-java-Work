public class calculation
{
    public static short hour(byte x)
    {
        return (short) (x*24);
    }
    public static int minute(byte x)
    {
        return (x*24*60);
    }
    public static long second(byte x)
    {
        return (x*24*60*60);
    }
}
