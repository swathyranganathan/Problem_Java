//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.math.*;
import java.util.*;

class lastDigitOfPower_G{
    public static void main(String args[]) throws IOException {
        System.out.println("enter number of test case: ");
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            System.out.println("Enter the values of a and b separated by space: ");
            String S[] = read.readLine().split(" ");

            String a = S[0];
            String b = S[1];

            Solution2 ob = new Solution2();
            System.out.println(ob.getLastDigit(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution2 {
    public static int Mod(int a, String b){
        int mod =0;
        for(int i=0;i<b.length();i++){
            mod=(mod*10+(b.charAt(i))-'0')%a;
        }
        return mod;
    }

    static int getLastDigit(String a, String b) {
        // code here
        int len_a = a.length();
        int len_b = b.length();

        if(len_b==1 && b.equals("0"))
        {return 1;  }

        if(len_a==1 && a.equals("0"))
        {return 0;  }


        int lastDigitOfA = a.charAt(len_a-1)-'0';
        int exp =Mod(4,b);
        if(exp==0){
            exp=4;
        }
        int result=(int) Math.pow(lastDigitOfA, exp);
        return result%10;
    }
}