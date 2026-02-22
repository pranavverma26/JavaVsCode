public class binomialCoefficient {
    public static int binocoeff(int n,int r){
        int f=1,q=1,t=1;
        for(int i = n;i>0;i--){
            f*=i;}
        for(int p = n-r;p>0;p--){
            q*=p;}
        for(int s = r;s>0;s--){
            t*=s;}
        int coeff = f/(t*q);
        return coeff;
    }
    public static void main(String[] args) {
        System.out.println("Binomial coefficient = " + binocoeff(5,2));
    }
}
