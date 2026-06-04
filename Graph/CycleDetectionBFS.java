package Graph;
import java.util.*;
class Pair {
    int parent;
    int child;

    Pair(int parent, int child) {
        this.parent = parent;
        this.child = child;
    }
}

public class CycleDetectionBFS {
    public static void main(String[] args) {

        int[][] adj = {
            {1},
            {0, 2},
            {3, 4, 1},
            {2, 4, 5},
            {2, 3},
            {3, 6},
            {5}
        };

        boolean[] vis = new boolean[adj.length];
        boolean flag = false;

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(-1, 0));
        vis[0] = true;

        while (!q.isEmpty()) {

            Pair rem = q.remove();

            int parent = rem.parent;
            int node = rem.child;

            for (int neighbor : adj[node]) {

                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(new Pair(node, neighbor));
                }
                else if (neighbor != parent) {
                    flag = true;
                }
            }
        }

        System.out.println(flag);
    }
}