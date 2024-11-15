import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long r=0;
        while(n!=0){
            r=r*10+n%10;
            n/=10;
        }
        if(r>=Integer.MIN_VALUE && r<= Integer.MAX_VALUE){
            System.out.println(r);
        }else{
            System.out.println(0);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
