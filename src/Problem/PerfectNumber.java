package Problem;//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class PerfectNumber{
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of test case: ");
        int t = Integer.parseInt(read.readLine()); // Read the number of test cases
        while (t-- > 0) {
            System.out.println("enter the number: ");
            int N = Integer.parseInt(read.readLine()); // Parse input as an integer

            NumberPerfect ob = new NumberPerfect();
            if (ob.isPerfectNumber(N))
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class NumberPerfect {
    static boolean isPerfectNumber(int n) {
        // code here
        int sum = 1;
        if(n<=1) return false;
        for(int i=2; i*i <= n; i++){
            if(n%i == 0){
                sum +=i;
                if(i != n/i){
                    sum+=n/i;
                }
            }
        }
        return sum==n;

    }
};
