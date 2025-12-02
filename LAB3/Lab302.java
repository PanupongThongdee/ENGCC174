package ENGCC174.LAB3;
import java.util.Scanner ;
public class Lab302 {
   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter Update Number : ");
        int num2 = input.nextInt();

        Player  Player = new Player(num1);
        Player.setScore(num2);
        System.out.println(Player.getScore());

  
    }
}

class Player{
    private int Score ;

    Player(int intialScore){
        this.Score = intialScore;
    }
    public int getScore(){
        return Score ;
    }
    public void setScore(int newscore){
        this.Score = newscore;
    }
}
