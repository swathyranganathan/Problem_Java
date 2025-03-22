package Problem;

import java.util.*;
class PowerOfNumber {
    // compute reverse of a number
    public static long rev(long n) {
        long rev_num = 0;
        while (n > 0) {
            rev_num = rev_num * 10 + n % 10;
            n = n / 10;
        }
        return rev_num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //testcases
        System.out.println("Enter the number of Test Case: ");
        int T = sc.nextInt();
        while (T-- > 0) {
            powerofNumber obj = new powerofNumber();

            int N;


            //input N
            System.out.println("Enter the input: ");
            N = sc.nextInt();
            int R = 0;


            // reverse the given number n
            R = (int) rev(N);

            //power of the number to it's reverse
            long ans = (long) obj.power(N, R);
            System.out.println(ans);


            System.out.println("~");
        }

    }
}

class powerofNumber
{

    long power(int N,int R)
    {
        //Your code here
        final int Mod = 1000000007;
        long result =1;
        long base= N % Mod;

        while(R>0){
            if(R % 2 == 1){
                result=(result*base)%Mod;
            }
            R=R/2;
            base=(base*base)%Mod;
        }
        return result;

    }

}
