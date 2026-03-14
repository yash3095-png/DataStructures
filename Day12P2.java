/*A factory uses a long conveyor belt carrying boxes with different weights.
Each position on the belt has a box with a certain weight.

The manager wants to find a special position called the "Balance Point".

A Balance Point is an index where:

Total weight of boxes on the left side
=
Total weight of boxes on the right side

Note:
- The element at the balance index itself is not counted in either side.
- If multiple balance points exist, return the first one.
- If no such index exists, print -1.

Input Format:
-------------

First line contains an integer N representing the number of boxes.

Second line contains N space-separated integers representing the weights.

Output Format:
--------------

Print a single integer representing the balance index.

Sample Input-1:
---------------

6
1 7 3 6 5 6

Sample Output-1:
----------------

3

Explanation:
------------

Left side sum = 1 + 7 + 3 = 11  
Right side sum = 5 + 6 = 11  

So index 3 is the balance point.


Sample Input-2:
---------------

3
1 2 3

Sample Output-2:
----------------

-1 */

import java.util.*;

public class Day12P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int ts=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            ts+=arr[i];
        }
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        int ans=-1;
        for(int i=0;i<n;i++){ 
            int ls=prefix[i]-arr[i];
            int rs=ts-prefix[i];
            if(rs==ls){
                System.out.println(i);
                return ;
            }
        }
        System.out.println(ans);
    }
}
