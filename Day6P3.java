/*
There is a series of bulbs in which some bulbs are turned on(indicated by 1) 
and others are off(indicated by 0). 

A contiguous sub-series of bulbs CSB with following rules.
    1. Number of bulbs with status as 'on' and 'off' are same.
    2. Bulbs which are 'on' and 'off' are grouped together.

You will be given the series as a string of 1's and 0's.
Your task is to find the count of all the CSBs  exist in the given series.



Input Format:
-------------
A string, indicates bulbs series.

Output Format:
--------------
Print an integer result.

Sample Input-1:
---------------
010011000110

Sample Output-1:
----------------
9

Explanation:
------------
01-3, 10-3, 0011-2, 1100-1 


Sample Input-2:
---------------
0101010

Sample Output-2:
----------------
6

Explanation:
------------
01-3, 10-3 */

import java.util.*;

public class Day6P3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int cur=1,prev=0,sum=0;
        int l=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                cur++;
            }
            else{
                sum+=Math.min(cur,prev);
                prev=cur;
                cur=1;
            }
        }
        sum+=Math.min(cur,prev);
        System.out.println(sum);
    }
}
