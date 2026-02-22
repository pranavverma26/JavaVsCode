package timeComplexity;

public class Q1 {
    public static void main(String[] args) {
        //Q).1 Calculate the time complexity for iterating in a loop.
        
        // for(int i = 0;i<n;i++){
        //     System.out.print("PhysicsWallah");
        // }
        // number of iterations(rounds) = no of operations.
        // Total number of operations(T.n.o) = n. [T.c(Time complexity) = O(n)]
        // Q)2. Calculate the time complexity.
        // i) for(int i=0;i<n+3;i++){
        //     System.out.println("PhysicsWallah");
        // } 
        // T.n.o = n + 3 so, T.C = O(n) here it is approximate of (n+3)

        // ii) for(int i=0;i<n;i+=2){
        //     System.out.println("P:hysicsWallah");
        // }
        // T.n.o = n/2
        // huma rounds bachana hota hai.
        // T.c. = O(n/2) ~ O(n)

        // Approximations :-
        // O(kn) ~ O(n)
        // O(n+k) ~ O(n) or O(n-k) ~ O(n)
        // O(5n + 4) ~ O(n)
        // 1). power of n are important.
        // O(n^2 + 5) ~ O(n^2)
        // O(100(n)^1/2 + 2) ~ O((n)^1/2)

        // 2). Highest power is considered.
        // O(n^3 + 100n^2-5n) ~ O(n^3)
        // O(n^1/3 + n^1/2) ~ O(n^1/2)

        //3). if there are other variables like m then they are seperate.
        // O(n+10m) ~ O(n+m)


        // Constant time complexity :-
        // ex :- for(int i =1;i<=200;i++){
        //System.out.println("hello");}

        // if n nahi hai means constant hai so :-
        // T.n.o = 200
        // T.C. = O(200) ~ O(1) because O(200*1)

    }
    
}
