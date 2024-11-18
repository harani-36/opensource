import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(find(n,a,x));
    }
    public static int find(int n, int[] a, int x){
        int l=0,r=n-1;
        while(l<r){
            int m=(l+r)/2;
            if(a[m]==x){
                return m;
            }
            else if(x<a[m]){
                r=m;
            }else{
                l=m+1;
            }
        }
        return -1;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
