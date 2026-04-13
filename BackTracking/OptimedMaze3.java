package BackTracking;

public class OptimedMaze3 {
    public static void main(String[] args) {
        /*
        A maze is an N*N binary matrix of blocks where the upper left block 
        is known as the source block, and the lower rightmost block is known
        as the destination block. If we consider the maze, then maze[0][0] is
        the source , and maze[N-1][N-1] is the destination. Our main task is to 
        reach the destination from the source. We have considered a rat as character
        that can move left,right,down,up.
        In the maze matrix, a few dead blocks will be denoted by 0 and active blocks
        will be denoted by 1. A rat can move only in the active blocks.
         */
        int[][] maze = {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}};
        int r = maze.length;
        int c = maze[0].length;
        path4(0,0,r-1,c-1,"",maze);  
    }
    private static void path4(int i, int j, int r, int c, String s, int[][] maze) {
        if(i<0 || j<0) return;
        if(i>r || j>c) return;
        if(maze[i][j]==0) return;
        if(maze[i][j]==-1) return;
        if(i==r && j==c){
            System.out.println(s);
            return;
        }
        maze[i][j]=-1;
        // go right
        path4(i,j+1,r,c,s+"R",maze);
        // go down
        path4(i+1,j,r,c,s+"D",maze);
        // go left
        path4(i,j-1,r,c,s+"L",maze);
        // go up
        path4(i-1,j,r,c,s+"U",maze);

        maze[i][j]=1;
       
    }
    
}
