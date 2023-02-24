import java.util.LinkedList;

//import Unit;
public class RoundMg {
    private LinkedList<Unit> battlefield = new LinkedList<>();
    private int unitOfNum = 0;
    private Player p1;
    private Player p2;

    public RoundMg(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void insertUnit(Unit u){
        battlefield.add(unitOfNum++, u);

    }
    public void showBattlefield(){
        System.out.println(p1.getCastleName()+"城                  城"+p2.getCastleName());
        for(int i = 1; i<=19; i++)
            for(Unit unit : battlefield)
                if(unit.getLocation()==i)
                    System.out.print(unit.getShape());
                else
                    System.out.print(" ");
        System.out.println();
    }
}
