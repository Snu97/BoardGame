public class Player {
    private int playerNumber;
    private String castleName;
    private int hp;
    private int money;


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void addMoney(int money) {
        this.money += money;
    }

    public void showPlayerStatus(){
        System.out.println("[System] "+castleName+"성의 남은 체력은 "+hp+"입니다.");
    }
    public Player(int playerNumber, String castleName, int hp, int money) {
        this.playerNumber = playerNumber;
        this.castleName = castleName;
        this.hp = hp;
        this.money = money;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getCastleName() {
        return castleName;
    }

    public void setCastleName(String castleName) {
        this.castleName = castleName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
