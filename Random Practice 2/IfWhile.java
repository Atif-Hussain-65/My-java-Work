public class IfWhile
{
    public static void main(String[] args)
    {
        int i = 'A';
        while (i <= 'z')
        {
            if (i=='A'||i=='T'|| i=='I' || i=='f')
            {
                System.out.println(i);
            }
            i++;
        }
        i='A';
        while (i <= 'z')
        {
            if (i==65||i==73|| i==84 || i==102)
            {
                System.out.print((char)i);
            }
            i++;
        }
    }
}
