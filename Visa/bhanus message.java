import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()>14 || s.length()<14){
            System.out.println("Incorrect");
            return;
        }
        if(find(s)){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    public static boolean find(String s){
        if(s.charAt(0)!='+' || !Character.isDigit(s.charAt(1)) || !Character.isDigit(s.charAt(2)) || s.charAt(3)!=' '){
            return false;
        }
        int sm=0;
        for(int i=4;i<14;i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
            sm+=s.charAt(i)-'0';
        }
        if(sm<1){
            return false;
        }
        return true;
    }
}
