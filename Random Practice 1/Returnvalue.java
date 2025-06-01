import java.util.Scanner;
public class Returnvalue
{
    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        while (true) {
            System.out.println("\nA.Area of circle\tB.Area of square");
            System.out.println("C.Area of rectangle\tD.Area of Triangle");
            System.out.println("E.To exit\tchoose a,b,c,d,e");
            String choice = si.next().toLowerCase();
            if (choice.equals("a")) {
                Circle.area();
            } else if (choice.equals("b")) {
                Square.area();
            } else if (choice.equals("c")) {
                Rectangle.area();
            } else if (choice.equals("d")) {
                Triangle.area();
            } else if (choice.equals("e")) {
                break;
            } else System.out.println("input not correct");
        }
    }
}
