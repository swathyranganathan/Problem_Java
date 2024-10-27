
import java.io.*;
import java.util.*;
import java.lang.String;
    class CountDigits_G
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the test case: ");
            int t = Integer.parseInt(read.readLine());
            while(t-- > 0)
            {
                System.out.println("Enter the input: ");
                int N = Integer.parseInt(read.readLine());
                CountDigit ob = new CountDigit();
                System.out.println(ob.evenlyDivides(N));

                System.out.println("~");
            }
        }
    }
// } Driver Code Ends


//User function Template for Java


    class CountDigit{
        static int evenlyDivides(int N){
            // code here
            int count=0;
        String N_str = Integer.toString(N);
        String[] N_arr= N_str.split("");
        for(int i =0; i< N_arr.length; i++){
            int N_int = Integer.valueOf(N_arr[i]);
            if(N_int !=0 && N%N_int==0){
                count=count+1;
            }
        }
        return count;
    }
}
