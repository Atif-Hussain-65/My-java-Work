import java.util.Scanner;

public class MainSquare
{
    public static void main(String[] args) {

        System.out.println("Enter the side of square");

        double number;
        Scanner si=new Scanner(System.in);
        number=si.nextDouble();

        Square area1= new Square(number);
        System.out.println("the area is"+area1.getArea());


    }
}
