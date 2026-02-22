public class decimalToBinary {
    public static void binary(int n){
        int t = n;
        int r,p=0,s=0;
        while (n>0){
            r = n%2;
            p = p + (r * (int)Math.pow(10,s));
            s++;
            n/=2;
        }
        System.out.println("Binary form of "+t+" = "+p);
        
    }
    public static void main(String[] args) {
        binary(21);
    }
    
}
