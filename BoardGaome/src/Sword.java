public class Sword {
    private static int strikePower = 3;
    private static int hp = 5;
    private static int range = 1;
    private static int speed = 3;
    private static int price = 3;


    public static Unit createSwordMan(int num){
        if(num==1)
            return new Unit(num, strikePower, hp, range,  speed, 1, "○");
        else
            return new Unit(num, strikePower, hp, range,  speed, 19, "●");
    }
    public static int swordManPrice(){
        return price;
    }

}
