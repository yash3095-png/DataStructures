/*In a team of N players, each player's jersey has a number printed on it.
Jersey numbers may be repeated.

You will be given the list of jersey numbers of N players. 
You need to find out number of pairs, wearing same jersey number.
i.e, pair[i]=[p1, p2], p1 and p2 are the index positions
jersey number of Player-p1 and Player-p2 should be same.  

If no such pair found, print "0".

Input Format:
-------------
Line-1: An integer N, number of players.
Line-2: N space separated integers, Jersey numbers of players.

Output Format:
--------------
Print an integer, number of pairs wearing same jersey number.


Sample Input-1:
---------------
6
1 2 3 1 1 3

Sample Output-1:
----------------
4

Explanation: 
------------
There are 4 pairs (0,3), (0,4), (3,4), (2,5) wearing same jersey numbers, 
0-indexed list.

Sample Input-2:
---------------
3
1 2 3

Sample Output-2:
----------------
0
 */

import java.util.*;

public class Day7P3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        //     hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
        //     int temp=entry.getValue();
        //     if(temp>1){
        //         sum+=(temp*(temp-1)/2);
        //     }
        // }
        // System.out.println(sum);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=hm.getOrDefault(arr[i],0);
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);

        }
        System.out.println(sum);

    }
}
