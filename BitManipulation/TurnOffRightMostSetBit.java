package BitManipulation;

public class TurnOffRightMostSetBit {
    public static void main(String[] args){
        

        // Q) Turn off the rightmost set bit.
            int a = 1475;
                                        // Method - 1
                        int k=0;
                        int b=a;
                        while(b%2==0){
                            b=b>>1;
                            k++;
                        }
                    System.out.printf("Turn off the rightmost set bit = %d\n",a&(~(1<<k)));

        /*          
                    n= 43 -> 101001
                    n= 42 -> 101000  trick => 43 k help sa 42 mai convert krna..Rightmost one koa zero bna doa and uska baad wala koa 1 bna doa.
                    n= 41 -> 100111  same trick will follow in this.
        */
                                        // Method -2
                    System.out.printf("Turn off the rightmost set bit using method 2 = %d\n",a&(a-1));
    }
    
}
