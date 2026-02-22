import java.util.Scanner;
public class primeOrNot {
    public static void prime(int a){
        int f = 0;
        for(int i = 2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    f =1;
                break;}
            }
       if(a==2){
        System.out.println("Prime number");}
       else{
            if(f==0) System.out.println("Prime number");
            if(f==1) System.out.println("Not prime number");
       } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        prime(a);
        sc.close();
    }
}
