package Array;

import java.io.*;
        import java.lang.*;


// } Driver Code Ends
// User function Template for Java

class Pair {

    int countPairs(int arr[], int target) {
        // Complete the function
        int len = arr.length;
        int count =0;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(arr[i]+arr[j] == target){
                    count ++;
                }
            }
        }
        return count;
    }
}


//{ Driver Code Starts.
public class Sum_Pair_G {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Test case:");
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            System.out.println("how many elements?");
//            String[] inputLine = br.readLine().trim().split(" ");
            int len = Integer.parseInt(br.readLine().trim());  // Read the number of elements
            System.out.println("Type the numbers");
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            //inputLine = br.readLine().trim().split(" ");
            System.out.println("Target value");
            int target = Integer.parseInt(br.readLine().trim());

            Pair obj = new Pair();
            int res = obj.countPairs(arr, target);
            System.out.println("count = ");
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends
