import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb = new StringBuilder();
        if(s.length()<1){
            System.out.println(s+1);
        }
        sb.append(s.charAt(0));
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                sb.append(c);
                sb.append(s.charAt(i));
                c=1;
            }else{
                c++;
            }
        }
        sb.append(c);
        System.out.println(sb.toString());
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
