package Problem;

import java.util.Scanner;

    public class IsPalindrome {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of Test case: ");
            int T = sc.nextInt(); // Number of test cases

            Palindrome ob = new Palindrome();

            while (T-- > 0) {
                System.out.println("Enter the number: ");
                int n = sc.nextInt();
                boolean ans = ob.isPalindrome(n);
                System.out.println(ans ? "true" : "false");
                System.out.println("~");
            }

            sc.close();
        }
    }

// } Driver Code Ends


// User function Template for Java

    class Palindrome {
        public boolean isPalindrome(int n) {
            // Code here
            String num = Integer.toString(n);
            int start=0;
            int end = num.length()-1;

            while(start<end){
                if(num.charAt(start)!=num.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }return true;
        }
    }

