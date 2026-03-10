/*There is a series of bulbs in which some bulbs are turned on(indicated by 1) 
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

class Day9P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int curr=1,prev=0,ans=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curr++;
            }
            else{
                ans+=Math.min(curr,prev);
                prev=curr;
                curr=1;
            }
        }
        ans+=Math.min(prev,curr);
        System.out.println(ans);
    }
}