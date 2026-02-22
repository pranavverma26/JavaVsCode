package Recurssion;
// import java.util.ArrayList;
// import java.util.Scanner;
public class nNaturalNum15 {
  // Recursive function
    public static void generate(int start, int n, int k, String ans) {
        // ✅ Base Case: if sequence length == k
        if (ans.length() == k) {
            System.out.println(ans);
            return;
        }

        // Try all numbers from 'start' to 'n'
        for (int i = start; i <= n; i++) {
            generate(i + 1, n, k, ans + i);
        }
    }

    public static void main(String[] args) {
        int n = 4, k = 2;
        generate(1,n, k, "");
    }
}

    

