import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            s+=a[i];
        }
        int l=0;
        for(int i=0;i<n;i++){
            s=s-a[i];
            System.out.print(Math.abs(s-l)+" ");
            l+=a[i];
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
