import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int m1=0,m2=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a%m==0){
                m2+=a;
            }else{
                m1+=a;
            }
        }
        System.out.println(m2-m1);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
