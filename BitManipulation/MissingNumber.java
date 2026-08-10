package BitManipulation;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr ={1,2,4,6,3,8};
        boolean[] trr = new boolean[arr.length+3];
        for(int i=0;i<arr.length;i++){
            int val = arr[i];
            trr[val]=true;
        }
        trr[0]=true;
        for(int j=1;j<trr.length;j++){
            if(trr[j]==false) System.out.print(j+" ");
        }
    }
}
