package Snake;

public class Map {
    private int[] coords = new int[2];

    private Dot dot = new Dot();

    //methods
    public int[] getMapSize() {return coords;}

    public void setMapSize(int x,int y)
    {
        coords[0] = x;
        coords[1] = y;
    }
}
