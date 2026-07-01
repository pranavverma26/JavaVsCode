package Graph;
import java.util.LinkedList;
import java.util.Queue;
public class CycleDetectionDirected {
        private static void bfs(int i,boolean[] vis,int[][] adj,int[] indeg){
        Queue<Integer> q = new LinkedList<>();
            if(indeg[i]==0){
                q.add(i);
                vis[i]=true;
            }
        
        while(!q.isEmpty()){
            int val = q.remove();
            ans.add(val);
            for(int j=0;j<adj[val].length;j++){
                indeg[adj[val][j]]--;
                if(indeg[adj[val][j]]==0 && !vis[adj[val][j]]){
                    q.add(adj[val][j]);
                    vis[adj[val][j]]=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        // In a DAG, when we apply topological sort -> BFS(khan's) we visit all the nodes.
        // So if we have a Directed Cyclic graph & we apply khan's algorithm then unusual happens.
                int[][] adj = {
                        {},     // 0
                        {},     // 1
                        {0},    // 2 -> 0
                        {1},    // 3 -> 1
                        {2,3},  // 4 -> 2,3
                        {4}     // 5 -> 4
                    };
         int n = adj.length;
         int[] indeg = new int[n];
         for(int[] ele : adj){
            for(int i : ele){
                indeg[i]++;
            }
         }
         boolean[] vis = new boolean[n];
         for(int i=0;i<n;i++){
            bfs(i,vis,adj,indeg);
         }
         for(int ele : ans){
            System.out.print(ele+" ");
         }
    }
    
}
