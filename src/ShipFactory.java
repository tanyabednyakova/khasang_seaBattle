import java.util.Random;

/**
 * Created by tanyabednyakova on 10/01/2017.
 */
public class ShipFactory {


    public Ship createShip(int deck, int x, int y, int g, int v){
        return new Ship(deck, x,y, g,v);
    }

    public Ship[] allShips()
    {
        Ship [] ships=new Ship[SeaBattle.allShips];
        int k=0;
        int n=0;
        for(int i=0; i<SeaBattle.allShips; i++)
        {
            if(n<SeaBattle.number1) {k=1; n++;}

            else if(i<SeaBattle.number2+SeaBattle.number1) k=2;

            else if(i<SeaBattle.number3+SeaBattle.number2+SeaBattle.number1) k=3;

            else k=4;


            ships[i]=this.createShip(k, 0,0, 1, 1);
        }

//        for(int i=0; i<SeaBattle.number1;i++)
//        {
//            ships[k]=shipFactory.createShip(1, 0,0, 1, 1);
//            k++;
//        }
//
//        for(int i=0; i<SeaBattle.number2;i++)
//        {
//            ships[k]=shipFactory.createShip(2, 0,0, 1, 1);
//            k++;
//        }
//
//        for(int i=0; i<SeaBattle.number3;i++)
//        {
//            ships[k]=shipFactory.createShip(3, 0,0, 1, 1);
//            k++;
//        }
//
//        for(int i=0; i<SeaBattle.number4;i++)
//        {
//            ships[k]=shipFactory.createShip(4, 0,0, 1, 1);
//            k++;
//        }

        return ships;

    }



}
