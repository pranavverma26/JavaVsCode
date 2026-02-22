package arrays;

public class nextGreatest2 {
    public static void main(String[] args) {
        int[] a = {12,8,41,37,2,49,16,28,21};
        int[] b = new int[a.length];
        int n = a.length;
        b[n-1]=-1;
        int nge = a[n-1];
        for(int i = n-2;i>=0;i--){
            b[i] = nge;
            nge = Math.max(nge,a[i]);

        }
        for(int ele : b){
            System.out.print(ele+" ");
        }
    }
    
}
