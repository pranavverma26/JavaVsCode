package timeComplexity;

public class nestedLoopTime {
    public static void main(String[] args) {
        /*  Q)4. Calculate the time complexity in nested loops.
         *  for(int i=0;i<n;i++){
         *      for(int j=0;j<m;j++){
         *          sout("okay")
         *  } pic :-9:48
         *  T.n.o = n*m
         *  T.C. = O(n*m)
         * }
         *  Note :- O(n) > O(n^2) > O(m*n)  here greater than means faster.
         * 
         * for(int i=0;i<n;i++){
         *      for(int j =0;j<i;j++){
         *          sout("okay")
         * T.n.o => 
         * i
         * 0 -> j =  X  o times
         * 1 -> j = 0   1 times
         * 2 -> j=0,1   2 times
         * .
         * .
         * n-1 ->  j =0,1,2...n-2     n-1 times
         * 
         * T.n.o = 0+1+2+3+....n-1 = ((n-1)*(n-1+1))/2 = n(n-1)/2 = (n^2)/2 - n/2
         * T.C. = O((n^2)/2 - n/2) ~  O(n^2)
         * 
         * In nested loops :-
         *          for(int i = 1 to n){
         *              for(j=1 to m){
         *                  for(k=1 to t)}}  If variables don't depend on outer loop.
         * 
         *        T.C. = O(n*m*t)
         * 
         * }}
         */
        
    }
    
}
