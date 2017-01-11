import java.util.Random;
import java.util.Scanner;

/**
 * Created by tanyabednyakova on 10/01/2017.
 */
public class SeaBattle {
    //  колличество кораблей
    public static final int number1=4;
    public static final int number2=3;
    public static final int number3=2;
    public static final int number4=1;
    public static final int allShips=number1+number2+number3+number4;
    private Ship[] ships;
    private VeiwSeaBattle veiw;

    // паттерн  singleTone
    private SeaBattle()
    {
        veiw=new ConsoleSeaBattle();
        veiw.printMessage("Welcome to the game SeaBatle!");
    }

    private static SeaBattle instance;

    public static  SeaBattle getInstance()
    {
        if(instance==null) instance=new SeaBattle();
        return instance;

    }


    public void initGame()
    {

        ShipFactory shipFactory=new ShipFactory();
        this.ships=shipFactory.allShips();
        veiw.drawGameField();
        for (int i = 0; i < ships.length; i++) {
            this.generateShipCoord(ships[i]);
            veiw.drawShip(ships[i]);
        }

    }

    //Серьезное усложнение: а теперь добавьте проверку на то,
    // чтобы корабли не пересекались при добавлении на поле,
    // и корабли не могут располагаться вплотную друг к другу.

    public boolean chekShipCoords(int x, int y)
    {
        return true;
    }

    // расстановка кораблей за компьютер
    public void generateShipCoord(Ship ship)
    {
        int x=0;
        int y=0;
        do {
            Random rnd = new Random();
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);
        }while(!chekShipCoords(x,y));

        ship.setXY(x,y);

    }

    // расстановка кораблей пользователем
    public void getShipCoordsUser(Ship ship)
    {
        int x=0;
        int y=0;
        Scanner in=new Scanner(System.in);
        do {
            if(x!=0 && y!=0) System.out.println("error!");
            veiw.printMessage("Enter x");
            x=in.nextInt();
            veiw.printMessage("Enter x");
            y=in.nextInt();
        }while(!chekShipCoords(x,y));

        ship.setXY(x,y);
    }

    public void shotUser(int x, int y)
    {
        if(this.shot(x,y))
        {
            veiw.drawDeck(x,y);
        }
        else
        {
            veiw.printMessage("out!");
        }
    }

    public void  shotRandom()
    {
        Random rnd=new Random();
        int x=rnd.nextInt();
        int y=rnd.nextInt();
        if(this.shot(x,y))
        {
            veiw.drawDeck(x,y);
        }
        else
        {
            veiw.printMessage("player out!");
        }


    }

    public boolean shot(int x, int y)
    {
        return true;
    }



    public void gameOver()
    {
        veiw.printMessage("game over!");
    }
}
