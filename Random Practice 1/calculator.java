import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner si=new Scanner(System.in);
        System.out.println("Enter the values like (number space operator space number)");
        double num1,num2,d;
        int a=0;
        char ch;
        for(;true;) {
            num1 =si.nextDouble();
            ch=si.next().charAt(0);
            num2=si.nextDouble();
            if (ch == '+') {
                a=sum(num1,num2);
                System.out.println(a);
            } else if (ch == '-') {
                a=sub(num1,num2);
                System.out.println(a);
            } else if (ch == '*') {
                a=mul(num1,num2);
                System.out.println(a);
            } else if (ch == '/') {
                d=div(num1,num2);
                System.out.println(d);
            } else if (ch == '%') {
                a=mod(num1,num2);
                System.out.println(a);
            } else {
                System.out.println("operator incorrect");
                break;
            }
        }
    }
    public static int sum(double a,double b){
        double c=a+b;
        return (int)c;
    }
    public static int sub(double a,double b){
        double c=a-b;
        return (int)c;
    }
    public static int mul(double a,double b){
        double c=a*b;
        return (int)c;
    }
    public static double div(double a,double b){
        double c=a/b;
        return c;
    }
    public static int mod(double a,double b){
        double c=(a%b);
        return (int)c;
    }
}

