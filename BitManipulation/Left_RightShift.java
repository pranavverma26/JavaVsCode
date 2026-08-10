package BitManipulation;
public class Left_RightShift {
    public static void main(String[] args) {
        /*
                                        Behaviour of operators

                    a -> 0,1

                   a|0 = 1 ; a & 1 =a ; a^1 = flipped a ;
                   a^0 = a
                   # To turn on a bit -> a|1 = 1
                   # To turn off a bit -> a&0 = 0

                                        Left Shift, Right Shift
                    
                                        Right Shift

                                 a = 1011011 -> (91) base 10
(no of bits shifted/removed from right)a>>2 -> 0010110 -> (22) base 10

                                        Left Shift
                                 a = 1001110 -> () base 10
(no of bits shifted/removed from right)a<<3 -> 1110000

                                 a = 1011011 -> (91) base 10
                            a<<2 = 101101100 -> (364) base 10
        */
       System.out.printf("Left shift of %d is %d\n",91,91<<2);
       /*
       byte x  = 01100110 -> 102
       x<<3 =>  00110000 -> 48
       
        // Q). Given 'n'. Find 2^n

            If "n" is even then -> 2^n/2 * 2^n/2
            if "n" is odd then -> 2^n/2 * 2^n/2 *2

            It's take much time. To solve this in o(1) time using bitwise operator(Left Shift).

            2^n = 100000.. => n zeros
            2^n = 1<<n
       */
        System.out.printf("2^4 = %d\n",1<<4);

        // Q). Swap two numbers(XOR)

             int a =5,b=6;
             
             // Method - 1
            System.out.println(a+" "+b);
             int temp =a;
             a=b;
             b=temp;
             System.out.println(a+" "+b);
            
             // Method - 2 (Mathmetics)
            System.out.println("Method - 2");
            System.out.println(a+" "+b);
             a = a+b;
             b=a-b;
             a=a-b;
            System.out.println(a+" "+b);

            // Method - 3 (Using XOR)
            System.out.println("method-3 (Using XOR)");
            System.out.println(a+" "+b);
            a = a^b;
            b=a^b;
            a=a^b;
            System.out.println(a+" "+b);

            /*
            
                                                Property of XOR

                                            X ^ X = 0;
                                            X ^ 0 = X;
                                        XOR is associative.

                                a = a^b
                                b = a^b => b = (a^b)^b because a=a^b
                                                a^(b^b) [b^b =0 and XOR is associative]
                                                a^0 = a
                                    therefore,  b=a
                                a=a^b => (a^b)^a [b=a, a^a=0]
                                          0^b=b
                                a=b

            */


            // Q). Check if kth bit is set or not.

            /*
                 index(k) = 10 9 8  7  6  5  4  3  2  1  0
                        a = 1  0 1  1  1  0  0  1  0  1  1
                        k=3
                    For this we have to do :-
                    0&1 = 0
                    1&1 = 1
                    mask = 0  0  0  0  0  0  0  1  0  0  0 (we get this by 1<<3)
            */
           // Solution :-
           int val =8;
           int k =4;
           int mask = 1<<(k);
           if((val & mask) == 0) System.out.println("Bit is not set");
           if((val & mask) != 0) System.out.println("Bit is set");

                                  // Method - 2
            val = val>>(k);
            if(val%2==0) System.out.println("Bit is not set");
            else System.out.println("Bit is set");

            

                    


    }
    
}
