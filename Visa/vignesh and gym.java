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
        long z=sc.nextLong();
        if((x+y)<=z){
            System.out.println(2);
        }else if(x<=z){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
/* 
Vignesh has decided to join a Gym and if possible, also hire a personal trainer at the gym. The monthly cost of the gym is X and personal training will cost him an additional Y per month. Vignesh's total budget per month is only Z.
Note: That if Vignesh wants to hire a personal trainer, he must join the gym — he cannot hire the trainer without joining the gym.
Input Format
A single line input containing 3 seperately sopaced integers (X,Y,Z).
Constraints
Output Format
Print 1 if Vignesh can only join the gym, 2 if he can also have a personal trainer, and 0 if he can't even join the gym.
Sample Input 0
1 2 3
Sample Output 0
2
Explanation 0
Since the total cost of Vignesh getting a gym membership and a trainer is 1+2=3 which is equal to his budget of 3, Vignesh can get both a gym membership and a trainer.
  */
