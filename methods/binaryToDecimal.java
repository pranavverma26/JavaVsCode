public class binaryToDecimal {
    public static void decimal(int n){
        int mynum = n;
        int dec =0,pow =0;
        while(n>0){
            dec = dec + (n%10)*(int)Math.pow(2,pow);
            pow++;
            n = n/10;}
        System.out.println("decimal of "+mynum+" = "+dec);

    }
    public static void main(String[] args) {
        decimal(1000);
    }
}
