package Recurssion;
import java.util.ArrayList;
public class subsetsArray14 {
    static ArrayList<ArrayList<Integer>> trr = new ArrayList<>();    
    public static void sub(int i, int[] arr, ArrayList<Integer> ans){
        if(i==arr.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j =0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            trr.add(ans);
            return;
        }
        sub(i+1,arr,ans);
        ans.add(arr[i]);
        sub(i+1,arr,ans);
        ans.remove(ans.size()-1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        sub(0,arr,ans);
        System.out.println(trr);
    }
    
}
