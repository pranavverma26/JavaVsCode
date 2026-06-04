package Graph;

import java.util.ArrayList;
import java.util.Collections;

public class TopoloGicalSortDFS {
    private static ArrayList<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        // Topological sort is always applicable on directed acyclic graph.
        // Ordering of all nodes of the graph such that if a and b are nodes & a->b then in the ordering a will always came before b.
        int[][] adj ={{1},{2,3},{4,3},{},{3}};
        int n = adj.length;
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                dfs(i,vis,adj);
            }
        }
         Collections.reverse(ans);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
    private static void dfs(int i, boolean[] vis, int[][] adj) {
            vis[i]=true;
            for(int j=0;j<adj[i].length;j++){
                if(vis[adj[i][j]] == false){
                    dfs(adj[i][j],vis,adj);
                }
            }
            ans.add(i);
    }
    
}
