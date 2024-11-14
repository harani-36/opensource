import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>12){
            System.out.println("Invalid");
        }else{
            switch(n){
                case 1:
                case 2:
                case 12 : System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5: System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8: System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:System.out.println("Autumn");
                    break;
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
