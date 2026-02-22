package arrays;
public class mergeTwoSortedArrayMthd2 {
    public static void main(String[] args) {
        int[] a ={1,2,11,45,63,81};
        int[] b ={3,4,5,6,66,89};
        int[] c = new int[a.length+b.length];
        int i=a.length-1,j=b.length-1,k=a.length+b.length-1;
        if(b.length>a.length){
            while(j>i){
                if(b[j]>a[i]){
                c[k]=b[j];
                j--;}else {
                    c[k]=a[i];
                i--;}
                k--;
            }
        }
        if(a.length>b.length){
            while(i>b.length){
                if(i>j){
                c[k]=a[i];
                i--;} else{
                    c[k] = b[j];
                    j--;
                }
                k--;
            }
        }
        while(i>=0){
            if(a[i]>b[j]){
                c[k]=a[i];
                i--;
                k--;
            }}
        while(j>=0){
            if(b[j]>a[i]){
                c[k]=b[j];
                j--;
                k--;
            }
        }
        for(int ele : c){
            System.out.print(ele+" ");
        }
        
    

    }
    
}
