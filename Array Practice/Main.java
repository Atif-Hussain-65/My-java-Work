public class Main {
    public static void main(String[] args) {
        int[] number = {1, 3, 4, 6, 7};
         change(number);
        for (int i=0;i< number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
    public static void change(int[] a) {
        a[2]=5;
    }
}