//Count total paths in a maze to move from (0,0) to (n,m). n=3,m=3
//condition- you can move only in right and downwards
public class countPath_rec {
    public static int CountPath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // move downwards
        int downpaths = CountPath(i + 1, j, n, m);

        // move right
        int rightpaths = CountPath(i, j + 1, n, m);
        return downpaths + rightpaths;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int TotalPaths = CountPath(0, 0, n, m);
        System.out.println(TotalPaths);
    }
}
