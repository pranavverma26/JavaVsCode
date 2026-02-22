package timeComplexity;

public class logarithimcTimeComp {
    public static void main(String[] args) {
        // Calculate the time complexity for the below code snippet.

        // int c = 0;
        // for(int i =1;i<=n;i*=2){
        //     c++;
        // }

        // O(n^2),O(n*m) are the examples of quadratic time complexity.

        // T.n.o = != n

        // eg :- n = 16
        //       i = 1,2,4,8,16
        //      for n then i = 1,2,4,8,16.......2^x(which is approx n)
        //   Here total x+1 terms.
        //   2^x = n applyinfg log both side.
        // we get x =  log(base 2)n
        // total value of i is equal to total numbers of operation
        // T.n.o =  log(base 2)n + 1
        // T.C = O(log(base 2)n) = O(logn/log2) here 1/log2 is constant so we can remove it.
        // T.C = O(logn)

        // Calculate the time complexity for the below code snippet.

        // int c = 0;
        // for(int i=1;i<=n;i*=k){
        //     c++;
        // }

        // k^n = n applying log both side we get
        // xlogk = logn
        // x = log(base k)n
        // T.n.o = log(base k)n + 1 
        // T.C. = O(logn)

    }
    
}
