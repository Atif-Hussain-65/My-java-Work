public class Methodcalling {
    public static void main(String[] args) {
        int x = 20,y= 10;
        double m =13.49,n = 34.9;
        Twomethods tm=new Twomethods();
        double store=(tm.show(x,y)*tm.show1(n,m));
        System.out.println(store);
    }
}
