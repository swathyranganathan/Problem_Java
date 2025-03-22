package Problem;

import java.io.*;

public class GCD_G {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of test case: ");
        int t;
        t=Integer.parseInt(br.readLine());
        while (t-- > 0){
            System.out.println("Enter the value of a: ");
            int a;
            a= Integer.parseInt(br.readLine());
            System.out.println("Enter the value of b: ");
            int b;
            b=Integer.parseInt(br.readLine());
            Gcd obj = new Gcd();
            int res = obj.gcd(a,b);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

class Gcd{
    public static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
