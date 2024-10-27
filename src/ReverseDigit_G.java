
import java.lang.*;
import java.io.*;
import java.lang.String;
class ReverseDigit_G {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Test Case: ");
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            System.out.println("Enter the input : ");
            long n = Long.parseLong(br.readLine().trim());
            ReverseDigit ob = new ReverseDigit();
            long ans = ob.reverse_digit(n);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

class ReverseDigit
{
    public long reverse_digit(long n)
    {
        // Code here
         long result=0;
         while (n>0){
             result=result*10+(n%10);
             n=n/10;
         }
           return result;
    }
}
