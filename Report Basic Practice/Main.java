import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name,cnic;
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name");
        name = s.nextLine();
        System.out.println("enter your cnic");
        cnic = s.nextLine();
        Report.employe(name,cnic);
    }
}