import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int z=sc.nextInt();
        if((a+b>=z) || (a+c>=z)||(b+c>=z)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}