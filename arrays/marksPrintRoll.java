package arrays;

public class marksPrintRoll {
    public static void main(String[] args) {
        //Given an array of marks of students, if the marks 
        // of any student is less than 35 print its roll 
        // number.[roll number here refers to the index of 
        // the array.] 
        int[] arr = {81,45,67,100,12,34,56,24};
        for(int i =0;i<arr.length;i++){
            if(arr[i]<35){
                System.out.println(i);
            }
        }
    }
    
}
