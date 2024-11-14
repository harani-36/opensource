import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x=sc.nextLong();
        long y=sc.nextLong();
        if(x<y){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
/*
Vignesh and his girlfriend went on a date. Chef took Xdollars with him, and was quite sure that this would be enough to pay the bill. At the end, the waiter brought a bill of Y dollars.

Input Format

A single line contains two spaced Integers x,y where \

X represents The money Vignesh brought
Y represents the Bill.
Constraints


Output Format

Print "YES" if Chef has enough money to pay the bill, or "NO" if he has to borrow from his girlfriend and leave a bad impression on her.*/
