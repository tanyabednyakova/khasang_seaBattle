/**
 * Created by tanyabednyakova on 10/01/2017.
 */
public class Ship {
    private int deck_num;
    private int x;
    private  int y;
    private  int g;
    private  int v;


    public  Ship(int deck_num, int x, int y, int g, int v)
    {
        this.deck_num=deck_num;
        this.x=x;
        this.y=y;
        this.g=g;
        this.v=v;

        System.out.println("ship is ready:"+ this.toString());
    }

    public void setXY(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    @Override
    public  String toString()
    {
        return "This ship has "+this.deck_num+" decs"+ " and coords are: "+ this.x+", "+this.y;

    }
}
