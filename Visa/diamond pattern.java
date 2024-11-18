import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<2*n;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
