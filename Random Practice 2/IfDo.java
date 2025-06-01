public class IfDo
{
    public static void main(String[] args)
    {
      int b=5;
      do
      {
      if(b>0 && b<15 && b!=9)
      {
          System.out.println(b);
      }
      b++;
      }
      while(b<=30);
    }
}
