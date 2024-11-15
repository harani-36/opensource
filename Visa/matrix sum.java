import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a = new int[n][n];
        int[] r = new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                s+=a[i][j];
            }
            r[i]=s;
            s=0;
        }
        int[] c = new int[n];
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                s+=a[i][j];
            }
            c[j]=s;
            s=0;
            
        }
        for(int i=0;i<n;i++){
            System.out.print(r[i]+c[i]+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
