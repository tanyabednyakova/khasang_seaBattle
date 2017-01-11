/**
 * Created by tanyabednyakova on 11/01/2017.
 */
public class ConsoleSeaBattle implements VeiwSeaBattle{

    @Override
    public void drawGameField() {
        System.out.println("  A B C D E F G H I J");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void drawShip(Ship ship) {

    }

    @Override
    public void drawDeck(int x, int y) {

    }

    @Override
    public void printMessage(String msg) {
        System.out.println(msg);

    }
}
