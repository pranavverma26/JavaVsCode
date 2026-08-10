package BitManipulation;
public class TestQuestionMajor {
    public static void main(String[] args){
        /*
        Given a list of intervals,representing the starting and end time of 'n' meetings. Find the minimum
        number of rooms required to hold all the meetings.
        */
       //int[][] arr = {{1,4},{2,5},{7,9}};
       int[][] arr = {{4,5},{2,5},{2,4},{3,5}};
       int count =1;
       int len=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                if(arr[i][j]>len) len =arr[i][j];
            }
       }
       boolean[] room = new boolean[len];
        for(int i=0;i<arr.length;i++){
            int first = arr[i][0];
            int last = arr[i][1];
            for(int j= first-1;j<last;j++){
                if(room[j]==false) room[j]=true;
                else{
                    count++;
                    break;
                }
            }
            }
            System.out.println(count);
       }



    }
    
