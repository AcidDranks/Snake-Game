package Snake;

public class Dot extends Map{
    private int[] coords = new int[2];

    //methods
    public int[] getCoords() {return coords;}

    public void setCoords(int x, int y)
    {
        coords[0] = x;
        coords[1] = y;
    }
}
