/*A retail company tracks the daily profit (which can be positive or negative) from a week-long festival sale.
Management wants to analyze how many continuous periods of days produced a total profit exactly equal to a target value K.

Your task is to determine how many such continuous subarrays exist.

A subarray means a continuous sequence of days.

Input Format:
-------------

First line contains two integers:
N K

N → number of days
K → target profit

Second line contains N space-separated integers representing daily profit values.

Output Format:
--------------

Print a single integer representing the number of continuous subarrays whose total profit equals K.

Sample Input-1:
---------------

5 5
1 2 3 -2 5

Sample Output-1:
----------------

2

Explanation:
------------

Subarrays with sum = 5

[2,3]  
[5]

So total = 2


Sample Input-2:
---------------

4 3
1 1 1 1

Sample Output-2:
----------------

2 */

import java.util.*;

public class Day12P3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0,cnt=0;
        hm.put(0,1);
        for(int i:arr){
            sum+=i;
            if(hm.containsKey(sum-k)){
                cnt+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        System.out.println(cnt);
    }
}
