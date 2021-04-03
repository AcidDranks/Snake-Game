package Snake.Common;

public class Map {
    private int[] mapSize = {64,64};

    private Dot dot = new Dot();

    public Map() {
        Dot.respawn();
    }

    //methods
    public int[] getMapSize() { return mapSize; }

    public void setMapSize(int x,int y)
    {
        mapSize[0] = x;
        mapSize[1] = y;
    }
}
