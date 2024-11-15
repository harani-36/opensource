import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int sm=0;
        for(int i=0;i<s.length();i++){
            sm+=(s.charAt(i)-'0');
        }
        if(sm%2==0){
            System.out.println("Vignesh");
        }else{
            System.out.println("Charan");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
