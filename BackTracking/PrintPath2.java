package BackTracking;
public class PrintPath2 {
   public static void main(String[] args) {
     int r =3;
    int c =3;
    print(1,1,r,c,"");
   }

   private static void print(int i, int j, int r, int c, String s) {
        if(i>r || j>c) return;
        if(i==r && j==c){
            System.out.println(s);
            return;
        }
        print(i+1,j,r,c,s+"D");
        print(i,j+1,r,c,s+"R");
   }
    
}
