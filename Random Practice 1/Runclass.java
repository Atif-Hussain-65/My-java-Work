import java.util.Scanner;
public class Runclass
{
    public static void main(String [] args)
    {
        Scanner si=new Scanner(System.in);
        System.out.println("Enter the class name");
        String clas=si.next();
        System.out.println("Enter the total number of students");
        int tnum=si.nextInt();
        System.out.println("Enter the number of present students");
        int pnum= si.nextInt();
        System.out.println("Enter the number of girls present");
        int gnum= si.nextInt();
        management(clas,tnum,pnum,gnum);
    }
    public static void management(String a,int b,int c,int d)
    {
        System.out.println("\t REPORT");
        int z;
        z=boys(c,d);
        report(a,b,c,d,z);
    }
    public static void report(String l,int m,int n,int p,int q)
    {
        System.out.println("Class:"+l);
        System.out.println("Total students:"+m+"\tPresent students:"+n);
        System.out.println("Number of girls:"+p+"\tNumber of boys:"+q);
    }
    public static int boys(int a,int b)
    {
        return (a-b);
    }

}
