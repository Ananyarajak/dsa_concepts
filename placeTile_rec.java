//Place Tiles of size 1xm in a floor of size nxm. n=4,m=4
public class placeTile_rec {
    public static int PlaceTiles(int n, int m) {

        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically
        int VerticalPlace = PlaceTiles(n - m, m);

        // horizaontally
        int HorizaontalPlace = PlaceTiles(n - 1, m);
        return VerticalPlace + HorizaontalPlace;

    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(PlaceTiles(n, m));
    }
}
