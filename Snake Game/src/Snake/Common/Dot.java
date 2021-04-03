package Snake.Common;

public class Dot {
    private static int[] coords = new int[2];

    Dot() {

    }

    //methods
    public int[] getCoords() { return coords; }

    public static void setCoords(int x, int y)
    {
        coords[0] = x;
        coords[1] = y;
    }

    public static void respawn() {
        setCoords(32,32);
    }
}
