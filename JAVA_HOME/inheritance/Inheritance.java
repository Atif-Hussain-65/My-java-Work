public class Inheritance {
    public static void main(String[] args)
    {

        laptop_dell laptopDell=new laptop_dell();
        laptopDell.ram();
        laptopDell.cpu();System.out.println("\t the method in (super/parent)class");
        laptopDell.cpuSpeed();System.out.println("\t\t the method in (super/parent)class");
        laptopDell.secondaryStorage();

        System.out.print("\n");

        laptop_hp laptopHp=new laptop_hp();
        laptopHp.ram();
        laptopHp.cpu();System.out.println("\t the method in (super/parent)class");
        laptopHp.cpuSpeed();System.out.println("\t\t the method in (super/parent)class");
        laptopHp.secondaryStorage();
    }
}

