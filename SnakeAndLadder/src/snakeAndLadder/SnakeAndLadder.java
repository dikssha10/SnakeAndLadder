package snakeAndLadder;
import java.util.Random;
import java.util.Scanner;
public class SnakeAndLadder {
    public static  int USER1=0;
    public static  int USER2=0;
    public static final int TARGET=100;
    public static void main(String[] args) {
        Random r = new Random();
        Random c = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first player name : ");
        String playerName1= sc.nextLine();
        System.out.print("Enter second Player name : ");
        String playerName2= sc.nextLine();
        for (int i = 0; i < 50; i++){
            if (USER1==100 || USER2==100)
                break;

            int deice1 = r.nextInt(1, 7);
            int check1 = c.nextInt(3);

            int deice = r.nextInt(1, 7);
            int check = c.nextInt(3);

            if (USER1==TARGET || USER2==TARGET) {
                USER1=USER1;
                USER2=USER2;
                break;
            }else if (USER1>TARGET || USER2>TARGET){
                USER1=USER1-deice;
                USER2=USER2-deice1;
                continue;
            } else if (USER1==99 || USER2==99) {
                deice=1;
                deice1=1;

            }
            System.out.println("\nScore : " +USER1);

            System.out.println("Rolling the deice for "+playerName1 +": "+deice);
            USER1=USER1+deice;
            System.out.println("Current score of "+playerName1 +" is : " +USER1);
            if (USER1==100 )
                break;

            if (check==0 ){
                System.out.println("You got nothing you can continue");
                System.out.println("Current score for "+playerName1 +" = "+USER1);

            } else {
                if (check==1 ) {
                    System.out.println("You have got a Ladder and you have to increase you score by "+deice + " and play again");
                    USER1=USER1+deice;
                    System.out.println("Current score of "+playerName1 +" is "+USER1);
                    continue;

                } else  {
                    System.out.println("You have got a Snake and you have to increase you score by "+deice);
                    USER1=USER1-deice;
                    System.out.println("Current score of "+playerName1 +" is "+USER1);

                }
            }

            System.out.println("\nScore : " +USER2);

            System.out.println("Rolling the deice for "+playerName2 +" : "+deice1);
            USER2=USER2+deice1;
            System.out.println("Current score of "+playerName2 +" is : "+USER2);
            if (USER2==100)
                break;


            if ( check1==0){
                System.out.println("You got nothing you can continue");
                System.out.println("Current score for "+playerName2 +" = "+USER2);

            } else {
                if ( check1==1) {
                    System.out.println("You have got a Ladder and you have to increase you score by "+deice1+ " and play again");
                    USER2=USER2+deice1;
                    System.out.println("Current score of "+playerName2 +" is "+USER2);
                    continue;

                } else  {
                    System.out.println("You have got a Snake and you have to increase you score by "+deice1);
                    USER2=USER2-deice1;
                    System.out.println("Current score of "+playerName2 +" is "+USER2);

                }
            }






        }
        if (USER1==TARGET){
            System.out.println("\nScore of  "+playerName1 +" is : "+USER1);
            System.out.println("Score of  "+playerName2 +" is : "+USER2);
            System.out.println(playerName1 +" has won the game!!!");
        }else if (USER2==TARGET){
            System.out.println("\nScore of  "+playerName1 +" is : "+USER1);
            System.out.println("Score of  "+playerName2 +" is : "+USER2);
            System.out.println(playerName2 +" has won the game!!!");
        }
    }
}
