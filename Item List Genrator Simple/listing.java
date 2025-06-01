import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class listing
{
    public static void main(String[] args) throws IOException {
        Scanner z=new Scanner(System.in);
        System.out.println("Enter the name of list");
        String name=z.nextLine().toUpperCase();
        String items[]=new String[50];
        System.out.println("\nLets make some list of items to buy\nEnter (exit) to stop");
        int i=0,j=1;
        while(i>=0)
        {
            System.out.println("Enter the item no " + j + ":");
            items[i] = z.nextLine().toLowerCase();
            if (items[i].equals("exit"))
            {
                break;
            }
            i++;
            j++;
        }
        int price[]=new int[50];
        int x=0; j=1;
        while(x>=0)
        {
            System.out.println(+j+".Enter the price of "+items[x]+":");
            price[x]=z.nextInt(); x++; j++;
            if (x==i)
            {
                break;
            }
        }
        int total=0;
        for (int c=0;c<=i;c++)
        {
            total=sum(price[c],total);
        }
        System.out.println("\nItems\tPrice");
        String filestore ="";
        for (int c=0;c<=i-1;c++)
        {
            System.out.println(items[c]+":\t"+price[c]);
            filestore=filestore.concat(items[c]+":\t"+price[c]+"\n");
        }
        System.out.println("Total:\t"+total);
        filestore=filestore.concat("Total:\t"+total);
        FileWriter writer=new FileWriter(name+".doc");
        writer.write(filestore);
        writer.close();
        String stop=z.next();

    }
    public static int sum(int a,int b)
    {
        b=b+a;
        return b;
    }
}