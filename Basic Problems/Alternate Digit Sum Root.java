// Given a positive integer N, your task is to alternately add and subtract digits from right to left, and repeat the process until you get a single-digit number.
// Start from the rightmost digit:
// Add the first digit (rightmost),
// Subtract the second digit,
// Add the third,
// Subtract the fourth,
// and so on...
// Repeat this process on the result (if it's more than one digit), until a single-digit number is obtained.

// Sample Input 
// 1234
// Sample Output 
// 2


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean add=true;
        int sum=0;
        while(n>0){
            int res=n%10;
            if(add){
                sum+=res;
            }
            else{
                sum-=res;
            }
            add=!add;
            n/=10;
        }
        sum=Math.abs(sum);
        System.out.println(sum);
    }
}
