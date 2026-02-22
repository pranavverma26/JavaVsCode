package twoDarray;
import java.util.Scanner;

public class check11 {
  
        
      
  
    
    public static String timeConversion(String s) {
    // Write your code here
    String p = s.substring(8,10);
    System.out.println(p);
    String q1 = s.substring(0,2);
    String q2 = s.substring(2, 8); 
    int t = Integer.valueOf(q1);
    if(p.equals("PM")){
        if(t!=12){
        t+=12;
        Integer.toString(t);
        }
        else {
            Integer.toString(t);
           
        }
    } 
    else if(p.equals("AM")){
      Integer.toString(t);
        
        if(t==12){
            String l ="00";
            return l+q2;
        }
    }
    return t+q2;
  

    }
    public static void main(String[] args) {
        System.out.println(timeConversion("03:02:06PM"));
        
    }

}

    

