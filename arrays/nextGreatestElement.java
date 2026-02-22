package arrays;
public class nextGreatestElement {
    public static void main(String[] args) {
        int[] a = {12,8,41,37,2,49,16,28,21};
        int[] b = new int[a.length];
        b[a.length-1] = -1;
        for(int i=0;i<a.length-1;i++){
            int mx = Integer.MIN_VALUE;
            for(int j = i+1;j<a.length;j++){
                mx=Math.max(mx,a[j]);
            }
            b[i]=mx;
        }
        for(int ele : b){
            System.out.print(ele+" ");
        }

    }
}
