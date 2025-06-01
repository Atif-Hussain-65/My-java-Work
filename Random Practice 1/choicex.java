public class choicex
{
    public static void stateif(String choice,byte x)
    {
        if (choice.equals("a")){
            short hours= calculation.hour(x);
            System.out.println("The hours in "+x+" days is "+hours);
        } else if (choice.equals("b")) {
            int minutes=calculation.minute(x);
            System.out.println("The minutes in "+x+" days is "+minutes);
        } else if (choice.equals("c")) {
            long seconds=calculation.second(x);
            System.out.println("The seconds in "+x+" days is "+seconds);
        }else System.out.println("input incorrect");


    }
}
