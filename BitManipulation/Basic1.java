package BitManipulation;

public class Basic1 {
    public static void main(String[] args) {

        // Leading values do not have any zeroes.
        // Example - 00001111 and 1111 both are same.

        // Binary to Decimal Conversion

        /*
         0 -> 0
         1 -> 1
         10 -> 2
         11 -> 3
         100 -> 4
         101 -> 5
         110 -> 6
         111 -> 7
         1000 -> 8
         1001 -> 9
         1010 -> 10
         1011 -> 11
         1100 -> 12
         1101 -> 13
         1110 -> 14
         1111 -> 15

         Binary Addition    2->10
                        
         power=     111   (1+1)=2=10  
                    1011
                   +1101
                  =11000          

                  1000.....0 = 2^k (if after 1 all zeros)
                  1111.....1 = 2^t-1 () 

                                               Bitwise AND, Bitwise OR 

                                               Logical and = &&    Bitwise and = &
                                               Logical or = ||     Bitwise or = |

                   Bitwise or          Bitwise and
                    0 | 0 =0            0 & 0 =0
                    0 | 1 =1            0 & 1 =0
                    1 | 0 =1            1 & 0 =0
                    1 | 1 =1            1 & 1 =1

                    x|0 = x        
                    x&0 = 0
                    x|x = x

                    Data types : To store integer
                     byte -> -2^7 to 2^7-1        -128 to 127
                     short -> -2^15 to 2^15-1     -32768 to 32767
                     int -> -2^31 to 2^31-1
                     long -> -2^63 to 2^63-1


        */
       System.out.printf("Bitwise or =%d%n",5|9);
    //     0101          In binary addition we go "Right to Left"
    //     1000          But in "|" and "&" we can start from any side.
    //     1101
       System.out.printf("Bitwise & = %d\n",5&9);

       /*
        Binary Number me bits hoti hai
        1 bit -> 2 number ko store kar skta hai -> o or 1
        1 byte -> 8 bits
       
        byte x = 127  _1111111 (leftmost empty place(_) is for sign, Where 0 -> +ve and 1 -> -ve)


                                              Bitwisw XOR(^)

                    Truth Table                      Even number of ones = 0
                    1 ^ 1 = 0                        odd number of ones = 1
                    1 ^ 0 = 1                   Bitwise operators associative hota hai
                    0 ^ 1 = 1
                    0 ^ 0 = 0

                                                              1's complement
                                                             1 0 1 1 0 0 1 -> 0 1 0 0 1 1 0  
                                                ~ -> tilde  \ -> backtick
                                            Kisi bhi number ka 1's complement nikalna k lya ush number koa negative kro and then ushma one minus kr doa..
                                        6's complement -> -6 -> -6-1 = -7 ans
       */
            System.out.printf("%d's complement -> %d\n",6,~6);

            /*
                                                            2's complement
                                                2's complement of x is -x
                                                2's comp(x) = 1's comp(x) + 1
 
                                byte -> 8 bits
                                short -> 16 bits
                                int -> 32 bits
                                long -> 64 bits
                                
                                nibble "c" mai hota hai not in java -> 4 bits
            
            
            */




       } 

    
}
