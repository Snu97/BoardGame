public class Player {
    private int playerNumber;
    private String castleName;
    private int hp;

    public void showPlayerStatus(){
        System.out.println("[System] "+castleName+"성의 남은 체력은 "+hp+"입니다.");
    }
    public Player(int playerNumber, String castleName, int hp) {
        this.playerNumber = playerNumber;
        this.castleName = castleName;
        this.hp = hp;
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
