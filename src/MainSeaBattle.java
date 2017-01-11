import java.util.Scanner;

/**
 * Created by tanyabednyakova on 10/01/2017.
 */
public class MainSeaBattle {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Hello! what is your name?");
        String userName=in.nextLine();
        System.out.println(userName+", press Enter to start new game!");
        in.nextLine();
        SeaBattle seaBattle=SeaBattle.getInstance();
        seaBattle.initGame();
        seaBattle.gameOver();


    }
}
