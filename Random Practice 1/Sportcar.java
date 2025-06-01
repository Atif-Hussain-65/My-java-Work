import java.util.Scanner;

public class Sportcar
{
    public static void names() {
        Scanner si=new Scanner(System.in);
        while (true) {
            System.out.println("A.Alpine A110\tB.Porsche 718 Boxster");
            System.out.println("C.McLaren 720S\tD.Bugatti Chiron");
            System.out.println("E.To exit");
            String choice;
            choice= si.next().toLowerCase();
            if (choice.equals("a")){
                Sportcarinfo.alpine();
            } else if (choice.equals("b")) {
                Sportcarinfo.porsche();
            } else if (choice.equals("c")) {
                Sportcarinfo.mclaren();
            } else if (choice.equals("d")) {
                Sportcarinfo.bugatti();
            } else if (choice.equals("e")) {
                break;
            }else System.out.println("incorrect input");
        }
    }
}
