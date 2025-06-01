public class shapen {
    public static void main(String[] args) {
     
        int i, j, x;
        for (i = 1; i <= 2; i++) {
            for (j = 1; j <= 100; j++) {
                if (j > 18 && j < 31 || j > 90 && j < 95) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 100; j++) {
                if (j > 0 && j < 100) {
                    System.out.print("8");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (i = 1, x = 1; i <= 9; x++, i++)
        {
            for (j = 1; j <= 80; j++)
            {
                if (j >= (10 - x) && j<=(30-x)||i == 1 && (j > 29 && j <= 45) ||i == 2 && (j > 27 && j < 30||j==44||j==45||j==34||j==35)
                ||i==3&&(j>26&&j<30||j==44||j==45||j==34||j==35)||i==4&&(j>25&&j<30||j==44||j==45||j==35)
                || i==5&&(j>24&&j<=45))
                {
                    System.out.print("8");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}