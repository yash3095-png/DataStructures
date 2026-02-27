/*A data monitoring system records a stream of signals using two symbols:
•	'X' → Stable state
•	'Y' → Unstable state
Due to minor transmission errors, you are allowed to correct at most K signals
in the stream (change 'X' to 'Y' or 'Y' to 'X').
Your task is to determine the maximum length of a continuous stable segment 
that can be achieved after performing at most K corrections.
A stable segment means a substring containing only identical characters.

 Input Format
Line 1: A string S consisting only of characters 'X' and 'Y'
Line 2: An integer K

 Output Format
Print a single integer — the maximum possible length of consecutive identical 
characters after at most K corrections.
Sample Input 1:
XXYY
2
Sample Output 1:
4
Sample Input 2:
XYYX
1
Sample Output 2:
3 */

import java.util.*;

class Day5P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int max=0,left=0;
        int maxF=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            hm.put(c,hm.getOrDefault(c,0)+1);
            maxF=Math.max(maxF,hm.get(c));
            while((right-left+1)-maxF>k){
                hm.put(s.charAt(left),hm.get(s.charAt(left))-1);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}
