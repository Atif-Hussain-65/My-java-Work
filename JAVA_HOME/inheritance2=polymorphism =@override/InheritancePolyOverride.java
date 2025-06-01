public class InheritancePolyOverride {
    public static void main(String[] args)
    {
        System.out.println("dell-laptop");
        laptop_dell laptopDell=new laptop_dell();
        laptopDell.cpu();laptopDell.colour();
        laptopDell.storage();laptopDell.operatingSystem();
        laptopDell.keyboard();laptopDell.screen();
        laptopDell.touchpad();laptopDell.material();

        System.out.println("\n hp-laptop");

        laptop_hp laptophp=new laptop_hp();
        laptophp.cpu();laptophp.colour();
        laptophp.storage();laptophp.operatingSystem();
        laptophp.keyboard();laptophp.screen();
        laptophp.touchpad();laptophp.material();

        System.out.println( "\nApple");

        laptop_apple laptopapple=new laptop_apple();
        laptopapple.cpu();laptopapple.colour();
        laptopapple.storage();laptopapple.operatingSystem();
        laptopapple.keyboard();laptopapple.screen();
        laptopapple.touchpad();laptopapple.material();
    }
}
