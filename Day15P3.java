/*In a colony drinking water is supplied through water tanks.
There is a big queue of N buckets, He need to fill all the N buckets in the queue.
The supplier can fill one bucket or two buckets at a time.

Print the number of distinct ways he can fill all the buckets.

Input Format:
-------------
An integer N, number of buckets in the queue.

Output Format:
--------------
Print the number of ways to fill all the buckets.


Sample Input-1:
---------------
2

Sample Output-1:
----------------
2




Sample Input-2:
---------------
4

Sample Output-2:
----------------
5 */

import java.util.*;

public class Day15P3 {
    static int count(int n){
        if(n<=1) return 1;
        return count(n-1)+count(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}
