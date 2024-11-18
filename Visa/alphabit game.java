import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.toLowerCase();
        int v=0,cn=0;
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                v++;
            }else{
                cn++;
            }
        }
        }
        System.out.println(v+","+cn);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
