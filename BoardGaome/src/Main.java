import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int turnNumber = 0;
        //각 유저의 정보를 입력
        System.out.print("[System] Play1의 성의 이름을 입력해주세요 : ");
        String castleName = sc.next();
        System.out.print("[System] Player1의 체력을 입력해주세요 : ");
        int hp = sc.nextInt();

        System.out.println("[System] 환영합니다. Player1님 "+castleName+"성을 지키고 적군을 물리치세요. 대륙통일을 기원합니다.");
        Player p1 = new Player(1, castleName, hp);

        System.out.print("[System] Player2의 성의 이름을 입력해주세요 : ");
        castleName = sc.next();
        System.out.print("[System] Player2의 체력을 입력해주세요 : ");
        hp = sc.nextInt();

        System.out.println("[System] 환영합니다. Player2님 "+castleName+"성을 지키고 적군을 물리치세요. 대륙통일을 기원합니다.");
        Player p2 = new Player(1, castleName, hp);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        while(p1.getHp()>0&&p2.getHp()>0){
            System.out.println(++turnNumber+"ROUND!");
        }
        if(p1.getHp()<=0&&p2.getHp()<=0)
            System.out.println("[System] 무승부!!");
        else if(p1.getHp()<=0)
            System.out.println("[System] Player2 "+p2.getCastleName()+"성의 승리입니다.");
        else
            System.out.println("[System] Player1 "+p1.getCastleName()+"성의 승리입니다.");


    }
}
