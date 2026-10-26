package Graph;
public class UndirectedCycleDetectionDFS {
    static boolean flag=false;
    public static void dfs(int[][] adj,boolean[] vis,int child,int parent){
        vis[child]=true;
        for(int i=0;i<adj[child].length;i++){
                if(vis[adj[child][i]]==false){
                    dfs(adj,vis,adj[child][i],child);
                }
                else if(adj[child][i] !=parent){
                    flag=true;
                    return;
                }
        }


    }
    public static void main(String[] args) {
        // int[][] adj = {
        //     {1},          // 0
        //     {0, 2},       // 1
        //     {1, 3, 5},    // 2
        //     {2, 4, 6},    // 3
        //     {3, 5},       // 4
        //     {2, 4},       // 5
        //     {3}           // 6
        // };
        int[][] adj = {
    {1},        // 0
    {0, 2},     // 1
    {1, 3, 4},  // 2
    {2},        // 3
    {2, 5},     // 4
    {4}         // 5
};
      
        boolean[] vis = new boolean[adj.length];
        dfs(adj,vis,0,-1);
        System.out.println(flag);

    }
    
}
