package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class TopoSortBFS_KhasnsAlgo {
    private static ArrayList<Integer> ans = new ArrayList<>();
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
                int num = adj[val][j];
                indeg[num]--;
                if(indeg[num]==0 && !vis[num]){
                    q.add(num);
                    vis[num]=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        // Topological Sort using BFS is known as Kahn's Algorithm.
        //  int[][] adj ={{1},{2,3},{4,3},{},{3}};
        // int[][] adj = {
        //             {1, 2}, 
        //             {3},    
        //             {3},    
        //             {4},    
        //             {}      
        //         };
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
