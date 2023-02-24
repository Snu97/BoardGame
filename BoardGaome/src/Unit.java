public class Unit {
    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    private int playerNumber;
    private int strikePower;
    private int hp;
    private int range;
    private int speed;
    private int location;
    private String Shape;


    public Unit(int playerNumber, int strikePower, int hp, int range, int speed, int location, String Shape) {
        this.playerNumber = playerNumber;
        this.strikePower = strikePower;
        this.hp = hp;
        this.range = range;
        this.speed = speed;
        this.location = location;
        this.Shape = Shape;

    }

    public String getShape() {
        return Shape;
    }

    public void setShape(String shape) {
        Shape = shape;
    }

    public int getStrikePower() {
        return strikePower;
    }

    public void setStrikePower(int strikePower) {
        this.strikePower = strikePower;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void moveLocation(int n){
        if(n==1)
            this.location++;
        else
            this.location--;
    }
}
