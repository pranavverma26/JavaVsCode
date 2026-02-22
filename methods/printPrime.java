public class printPrime {
    public static void prime(int n){
        for(int i =2;i<=n;i++){
            int f =0;
                for(int p=2;p<=Math.sqrt(i);p++){
                    if(i%p==0){
                        f=1;
                        break;}}
            if(i==2) System.out.println(i);
            else{
                if(f==0) System.out.println(i); ;
            }           
            }    
        }
    
    public static void main(String[] args) {
        prime(10);
    }
}
