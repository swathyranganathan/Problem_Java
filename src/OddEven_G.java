
//{ Driver Code Starts
// Initial Template for Java
import java.io.*;

class OddEven_G{
    public static void main(String args[]) throws IOException {
        System.out.println("enter test case: ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            System.out.println("enter the input: ");
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.oddEven(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String oddEven(int n) {
        // code here
        if(n%2 == 0){
            return "even";
        }
        else
            return "odd";
    }
}