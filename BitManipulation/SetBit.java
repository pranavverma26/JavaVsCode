package BitManipulation;
import java.util.Scanner;
public class SetBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("k = ");
        int k = sc.nextInt();

        // Q) Turn on/set the kth bit.
        System.out.printf("Value after setting the %dth bit is %d\n",k,n|(1<<k));

        // Q) Turn off/clear the kth bit.
        int mask =~(1<<k);
        System.out.printf("turn off/clear the %dth is %d",n,n&mask);

        // Q) Toggle the kth bit (XOR)
        System.out.printf("Toggle the %dth bit %d",n,n^(1<<k));


        sc.close();
    }

    
}
