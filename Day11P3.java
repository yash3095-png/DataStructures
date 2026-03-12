/*A passenger must travel through several cities using express trains.
The distances between consecutive cities are given.
All trains travel at the same constant speed.
However, trains depart only at integer hours.  
If a passenger arrives at a station before the next integer hour, they must 
wait until the next integer hour to board the next train.

Only the last train does not require waiting.

Given the distances between cities and the total allowed travel time,
determine the minimum integer speed required to complete the journey within 
the allowed time.

If it is impossible to reach on time, print -1.

Input Format:
-------------

First line contains an integer N representing the number of train segments.

Second line contains N space-separated integers representing the distances.

Third line contains a decimal number H representing the maximum allowed
travel time.

Output Format:
--------------

Print a single integer representing the minimum required speed.
If it is impossible, print -1.

Sample Input-1:
---------------

3
1 3 2
6

Sample Output-1:
----------------

1

Explanation:
------------

Speed = 1

Travel times:
1/1 = 1 hour
3/1 = 3 hours
2/1 = 2 hours

Total = 6 hours which is within the allowed time.

Sample Input-2:
---------------

3
1 3 2
2.7

Sample Output-2:
----------------

3 */

import java.util.*;

public class Day11P3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double k=sc.nextDouble();
        int ans=-1;
        int low=1,high=10000000;
        while(low<=high){
            int mid=low+(high-low)/2;
            double time=0;
            for(int i=0;i<n-1;i++){
                time+=Math.ceil((double)arr[i]/mid);
            }
            time+=(double)arr[n-1]/mid;
            if(time<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
