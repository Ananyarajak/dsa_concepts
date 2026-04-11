import java.util.ArrayList;

public class subsetOfn_rec {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = -0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void FindSubset(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            printSubset(subset);
            return;
        }
        // Add hoga
        subset.add(n);
        FindSubset(n - 1, subset);

        // Add nahi hoga
        subset.remove(subset.size() - 1);
        FindSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        FindSubset(n, subset);
    }
}
