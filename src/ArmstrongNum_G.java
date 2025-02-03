
//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
        import java.util.*;

public class ArmstrongNum_G{
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Amg ob = new Amg();
            boolean flag = ob.armstrongNumber(n);
            if (flag) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Amg {
    static boolean armstrongNumber(int n) {
        // code here
        int sum =0;
        int original =n;
        int digits = String.valueOf(n).length();

        while(n>0){
            int num=n%10;
            sum = sum + (int)Math.pow(num,digits);
            n=n/10;
        }
        return sum == original;
    }
}