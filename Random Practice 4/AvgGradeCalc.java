import java.util.Scanner;

public class AvgGradeCalc
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Student student=new Student();
        System.out.println("Enter Student ID:");
        student.setStdId(input.nextLine());
        double[] marks=new double[student.getSbjGrades().length];
        for (int i=0;i<student.getSbjGrades().length;i++){
            System.out.println("Enter the "+(i+1)+" Subject Marks:");
            marks[i]=input.nextDouble();
        }
        student.setSbjGrades(marks);
        student.displayStdInfo();
        System.out.println("Student Average Marks: "+student.avgMarks());

    }
}
class Student{
    private String stdId;
    private double[] sbjGrades;  //cannot create instance of array in class body, it should be in methods body.

    Student(){                    // this is explicit default constructor helps initialize array.
        sbjGrades=new double[4];  // Program should store 4 subject marks (given).
    }

    public String getStdId() {
        return stdId;
    }
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
    public double[] getSbjGrades() {
        return sbjGrades;
    }
    public void setSbjGrades(double[] sbjGrades) {
        this.sbjGrades = sbjGrades;
    }
    public double avgMarks(){
        double average=0;
        for (int i=0;i<sbjGrades.length; i++){
            average=average+sbjGrades[i];
        }
        average=average/sbjGrades.length;
        return average+1e-3;
    }
    public void displayStdInfo(){
        int i=1;
        System.out.println("\nStudent ID: "+stdId);
        for (Double x:sbjGrades){
            System.out.println("Subject "+i+" Marks : "+x);
        i++;
        }
    }
}
