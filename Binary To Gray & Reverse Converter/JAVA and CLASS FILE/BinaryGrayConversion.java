import java.util.Scanner;

public class BinaryGrayConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            mainMenu();
            String UserinputChoice = input.next();
            if (UserinputChoice.equalsIgnoreCase("btg")) {
                System.out.print("Enter BINARY number: ");
                String number = input.next();
                String[] arrayC = arrayconversion(number);
                btg(arrayC);
            } else if (UserinputChoice.equalsIgnoreCase("gtb")) {
                System.out.print("Enter GRAY number: ");
                String number = input.next();
                String[] arrayC = arrayconversion(number);
                gtb(arrayC);
            } else if (UserinputChoice.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Command error");
            }
        }
    }

    public static void mainMenu() {
        System.out.println("\nCONVERSION FROM BINARY TO GRAY AND GRAY TO BINARY");
        System.out.println("A.BINARY TO GRAY(BTG)\t\tB.GRAY TO BINARY(GTB)\nC.EXIT(EXIT)");
        System.out.println("Input the commands in brackets regardless of casing");
    }

    public static String[] arrayconversion(String number) {
        String temp = String.valueOf(number);
        int length = temp.length();
        String[] arrayC = new String[length];
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = (String.valueOf(temp.charAt(i)));
        }
        return arrayC;
    }

    public static void btg(String[] arrayC) {
        String[] grayArray = new String[arrayC.length];
        grayArray[0] = arrayC[0];
        for (int i = 0; i < arrayC.length - 1; i++) {
            if (arrayC[i].equalsIgnoreCase("0") && arrayC[i + 1].equalsIgnoreCase("0")) {
                grayArray[i + 1] = 0 + "";
            } else if (arrayC[i].equalsIgnoreCase("0") && arrayC[i + 1].equalsIgnoreCase("1")) {
                grayArray[i + 1] = 1 + "";
            } else if (arrayC[i].equalsIgnoreCase("1") && arrayC[i + 1].equalsIgnoreCase("0")) {
                grayArray[i + 1] = 1 + "";
            } else if (arrayC[i].equalsIgnoreCase("1") && arrayC[i + 1].equalsIgnoreCase("1")) {
                grayArray[i + 1] = 0 + "";
            }
        }
        System.out.print("The Gray number is : ");
        for (int i = 0; i < grayArray.length; i++) {
            System.out.print(grayArray[i]);
        }
        System.out.println();
        btgDiagram(arrayC, grayArray);
    }

    public static void gtb(String[] arrayC) {
        String[] grayArray = new String[arrayC.length];
        grayArray[0] = arrayC[0];
        for (int i = 0; i < grayArray.length - 1; i++) {
            if (grayArray[i].equalsIgnoreCase("0") && arrayC[i + 1].equalsIgnoreCase("0")) {
                grayArray[i + 1] = 0 + "";
            } else if (grayArray[i].equalsIgnoreCase("0") && arrayC[i + 1].equalsIgnoreCase("1")) {
                grayArray[i + 1] = 1 + "";
            } else if (grayArray[i].equalsIgnoreCase("1") && arrayC[i + 1].equalsIgnoreCase("0")) {
                grayArray[i + 1] = 1 + "";
            } else if (grayArray[i].equalsIgnoreCase("1") && arrayC[i + 1].equalsIgnoreCase("1")) {
                grayArray[i + 1] = 0 + "";
            }
        }
        System.out.print("The BINARY is    : ");
        for (int i = 0; i < grayArray.length; i++) {
            System.out.print(grayArray[i]);
        }
        System.out.println();
        gtbDiagram(arrayC, grayArray);
    }

    public static void gtbDiagram(String[] arrayC, String[] grayArray) {
        System.out.println("Diagram:");
        for (String x : arrayC) {
            System.out.print(x + "   ");
        }
        System.out.println();
        for (int i = 0; i < arrayC.length; i++) {
            if (i == arrayC.length - 1) {
                System.out.print("|");
            } else {
                System.out.print("|" + " / ");
            }
        }
        System.out.println();
        for (String x : grayArray) {
            System.out.print(x + "   ");
        }
    }

    private static void btgDiagram(String[] arrayC, String[] grayArray) {
        System.out.println("Diagram:");
        for (int i = 0; i < grayArray.length; i++) {
            if (i == arrayC.length - 1) {
                System.out.print(arrayC[i]);
            } else {
                System.out.print(arrayC[i] + " -> ");
            }
        }
        System.out.println();
        for (String x : arrayC) {
            System.out.print("|" + "    ");
        }
        System.out.println();
        for (String x : grayArray) {
            System.out.print(x + "    ");
        }
    }
}
