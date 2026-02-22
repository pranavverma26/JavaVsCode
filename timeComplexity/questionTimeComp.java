package timeComplexity;

public class questionTimeComp {
    public static void main(String[] args) {
        //Q). Calculate the time complexity for the following code snippet.

    //     int c = 0;
    //     for(int i =1;i<n;i+=i){  i+=i means i*=2 (1,2,4,8,16...)
    //         c++;
    //     }   i =1,2,4,8...2^x = [2^x = n]
    //       T.n.o = log(base 2)n
    //       T.C. = O(logn)

    //  Q). Calculate the time complexity for the following code snippet.

    //      int c = 0;
    //      for(int i = 1;i<n;i+=i){  i =1,2,4,8...2^x
    // //         for(int j=0;j<i;j++){  i  ya i times chlega hrr barr.(image -2:51 date - 15/07)
    //                c++;               0 -> j =  X  o times
    //                                   1 -> j = 0   1 times
    //                                   2 -> j=0,1   2 times
    //                                   4 -> j=0,1,2,3
    //                                   .
    //                                   n-1 ->  j =0,1,2...n-2     n-1 times
    //              joa i ki value hai utni time loop chlega so max i n tkk jaeyga
    //              T.n.o = 1+2+4+8+....n-1  (2^x = n-1)
    //                    = 1+2+4+8.....2^x now it is in g.p so sum =
    //                    = 1*(2^(x+1) - 1)/(2-1)
    //                    = 2*2^x-1
    //                    = 2*n-1(2^x ~ n)
    //                    
    //             
    //         } t.c. =O(n)

    // Note :- n> (n)^1/2 > logn    [time complexity of logn is better than n and n have better t.c. than n^2
    //      }

    // Q). Calculate the time complexity for the following code snippet.

    //  int c = 0;
    //  for(int i=1;i<n;i+=i){  ya logn times chlega
            // for(int j=n;j>=0;j--){  here j does not depend on i so ya n-1 times chlega
            //     c++;
            // }}

            // T.C. = O((n+1)*logn)
            // T.C. = O(n*logn + logn)
            // T.C. = O(nlogn)

     // Calculate the time complexity for the following code snippet.

     // int c = 0;
     // for(int i=1;i*i<n;i*=2){          1,2,4,8...n^1/2 = n^1/2 = 2^x apply log both side so for upper loop T.C. =O(logn)
            // for(int j=0;j<i;j++){     i 
    //                                   0 -> j =  X  o times
    //                                   1 -> j = 0   1 times
    //                                   2 -> j=0,1   2 times
    //                                   4 -> j=0,1,2,3
    //                                   .
    //                                   n-1 ->  j =0,1,2...n^(1/2) - 1     n-1 times
            //     c++;
            // }}
            // T.n.o = 1+2+4+8+..n^1/2  [n^1/2 = 2^x]
            // T.n.o = 1+2+4+8+..2^x
            // T.n.o = 2*2^x - 1
            //       = 2*2^1/2 - 1
            // T.C. = O(n^(1/2))
    
    // Q). Calculate the time complexity of the following code snippet.


      }
    
}
