import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char v=sc.next().charAt(0);
        char c=sc.next().charAt(0);
        if(v==c){
            System.out.println("NULL");
        }
        else if((v=='R' && c=='P') || (v=='P' && c=='S') || (v=='S' && c=='R')){
            System.out.println("Charan");
        }else{
            System.out.println("Vignesh");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
