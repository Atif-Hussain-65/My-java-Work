import java.util.Scanner;

public class Sportsvehicle
{
    public static void main(String[] args)
    {
        Scanner si=new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to WHEELS DOC");
            System.out.println("WE OFFER THE FOLLOWING");
            System.out.print("A.Sports Cars");
            System.out.println("\tB.To exit");
            System.out.println("choose a,b,c,d,e");
            String choice = si.next().toLowerCase();
            if (choice.equals("a")) {
                Sportcar.names();
            } else if (choice.equals("b")){
                break;
            }else System.out.println("input incorrect");
        }
    }
}
