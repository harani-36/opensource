import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        boolean[] r = new boolean[n];
        boolean[] c = new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i]==true || c[j]==true){
                    a[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
