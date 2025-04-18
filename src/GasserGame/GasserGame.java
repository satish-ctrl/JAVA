package GasserGame;
import java.util.Scanner;

//GASSER CLASS
class Gasser{
    int gessNum;
    int gassingNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Gesser gess the number:");
        gessNum=sc.nextInt();
        return gessNum;
    }
}

//PLAYER CLASS
class Player {
    int gessNum;

    int gessingNumber(int playerNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player " + playerNumber + " guess the number:");
        gessNum = sc.nextInt();
        return gessNum;
    }
}

//UMPIRE CLASS
class Umpire{
    int numForGesser;
    int numForPlayer1;
    int numForPlayer2;
    int numForPlayer3;

//METHOD FOR NUMBER COLLECT FROM GASSER
    void collectNumFromGesser(){
        Gasser g=new Gasser();
        numForGesser=g.gassingNumber();
    }

//METHOD FOR NUMBER COLLECT FROM PLAYER
    void collectNumFromPlayers(){
        Player p1=new Player();
        numForPlayer1=p1.gessingNumber(1);
        Player p2=new Player();
        numForPlayer2=p2.gessingNumber(2);
        Player p3=new Player();
        numForPlayer3=p3.gessingNumber(3);

    }
//    GESS NUMBER COMPARISION METHOD
    void compareNum(){
        if(numForGesser==numForPlayer1){
            if(numForGesser==numForPlayer2 && numForGesser==numForPlayer3){
                System.out.println("All player win the game");
            }else if(numForGesser==numForPlayer2){
                System.out.println("Player 1 and Player 2 win the game");
            }else if(numForGesser==numForPlayer3){
                System.out.println("Player 1 and Player 3 win the game");
            }else{
                System.out.println("Player 1 win the game");
            }
        }
        else if(numForGesser==numForPlayer2){
            if(numForGesser==numForPlayer3){
                System.out.println("Player 2 and Player 3 win the game");
            }else{
                System.out.println("Player 2 win the game");
            }
        }
        else if(numForGesser==numForPlayer3){
            System.out.println("Player 3 win the game");
        }
        else{
            System.out.println("No one win the game");
        }

    }

}//jfdjffsdi

//MAIN CLASS
public class GasserGame {
    public static void main(String[] args) {
        System.out.println("Start the game");
        Umpire u=new Umpire();
        u.collectNumFromGesser();
        u.collectNumFromPlayers();

        u.compareNum();
    }
}
