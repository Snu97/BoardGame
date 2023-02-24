import java.util.Scanner;

public class Main {
    final static int startMoney = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turnNumber = 0;
        int sel;
        //각 유저의 정보를 입력
        System.out.print("[System] Play1의 성의 이름을 입력해주세요 : ");
        String castleName = sc.next();
        System.out.print("[System] Player1의 체력을 입력해주세요 : ");
        int hp = sc.nextInt();

        System.out.println("[System] 환영합니다. Player1님 "+castleName+"성을 지키고 적군을 물리치세요. 대륙통일을 기원합니다.");
        Player p1 = new Player(1, castleName, hp, startMoney);

        System.out.print("[System] Player2의 성의 이름을 입력해주세요 : ");
        castleName = sc.next();
        System.out.print("[System] Player2의 체력을 입력해주세요 : ");
        hp = sc.nextInt();

        System.out.println("[System] 환영합니다. Player2님 "+castleName+"성을 지키고 적군을 물리치세요. 대륙통일을 기원합니다.");
        Player p2 = new Player(1, castleName, hp, startMoney);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        RoundMg rm = new RoundMg(p1, p2);
        //라운드 시작 지원금
        while(p1.getHp()>0&&p2.getHp()>0){
            //라운드 시작
            p1.addMoney(2);
            p2.addMoney(2);
            System.out.println();
            System.out.println(++turnNumber+"ROUND!");
            System.out.println("[System] 지원금이 도착했습니다.");

            //Player1의 차례
            System.out.println(p1.getCastleName()+"성의 보유금 : "+p1.getMoney());
            System.out.println("[System] 메뉴를 골라주세요. ");
            System.out.println("    1. 대기");
            System.out.println("    2. 병력 모집");
            System.out.println("    3. 항복");
            sel = sc.nextInt();
            System.out.print(" : ");
            switch (sel){
                case 2 :
                    if(p1.getMoney()>=Sword.swordManPrice()){
                        rm.insertUnit(Sword.createSwordMan(1), p1);
                        p1.setMoney(p1.getMoney()-Sword.swordManPrice());
                    }
                    break;
                case 3 :
                    p1.setHp(0);
                    break;
                default:
                    break;
            }


            //Player2의 차례
            System.out.println(p2.getCastleName()+"성의 보유금 : "+p2.getMoney());
            System.out.println("[System] 메뉴를 골라주세요. ");
            System.out.println("    1. 대기");
            System.out.println("    2. 병력 모집");
            System.out.println("    3. 항복");
            sel = sc.nextInt();
            System.out.print(" : ");
            switch (sel){
                case 2 :
                    if(p2.getMoney()>=Sword.swordManPrice()){
                        rm.insertUnit(Sword.createSwordMan(2), p2);
                        p2.setMoney(p2.getMoney()-Sword.swordManPrice());
                    }
                    else{
                        System.out.println("[System] 보유금이 부족합니다.");
                    }
                    break;
                case 3 :
                    p2.setHp(0);
                    break;
                default:
                    break;
            }
            rm.showBattlefield();

        }
        
        
        
        //승리 조건
        if(p1.getHp()<=0&&p2.getHp()<=0)
            System.out.println("[System] 무승부!!");
        else if(p1.getHp()<=0)
            System.out.println("[System] Player2 "+p2.getCastleName()+"성의 승리입니다.");
        else
            System.out.println("[System] Player1 "+p1.getCastleName()+"성의 승리입니다.");


    }
}
