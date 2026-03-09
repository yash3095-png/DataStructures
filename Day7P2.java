/*There are N sticks of various lengths, stklen[], where stklen[i] is the length of the i-th stick.
And you need to break them into pieces of any length.
And you will be given another integer P, number of pieces you need to make.
You need to break the sticks to make P pieces of equal lengths.
You can consider the unwanted piece as scrap.

You can break a stick of length 6 as follows:
	- 6 pieces of length-1.
	- 1 piece of length-1 and 1 piece of length-2 and one piece of length-3.
	- 3 pieces of length-2, etc.
	
Your task is to check, can you break the sticks into P pieces of equal length,
if possible, retrun the maximum length of the pieces possible.
otherwise return 0.

Input Format:
-------------
Line-1: Two space separated integers, N and P.
Line-2: N space separated integers, length of the sticks.

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
3 3
6 8 10

Sample Output-1:
----------------
6


Sample Input-2:
---------------
3 4
6 8 10

Sample Output-2:
----------------
5 */

import java.util.*;

public class Day7P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int[] arr=new int[n];
        int high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            high=Math.max(arr[i],high);
        }
        int low=1,finall=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=0;
            for(int i=0;i<n;i++){
                ans+=arr[i]/mid;
            }
            if(ans>=p){
                finall=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(finall);
    }
}
