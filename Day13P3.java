/*A railway maintenance team is rearranging the order of coaches in a train.
Each coach has a unique identification number and the coaches are currently
connected in a single line.

Due to track maintenance requirements, the entire train must be reversed so
that the last coach becomes the first and the first coach becomes the last.

The coaches are connected sequentially, similar to a chain, where each coach
points to the next coach.

Your task is to reverse the order of the coaches and print the new arrangement.

Input Format:
-------------

First line contains an integer N representing the number of coaches.

Second line contains N space-separated integers representing coach IDs
in their current order from front to back.

Output Format:
--------------

Print the coach IDs after reversing the train order.
Constraint:
You must implement the reversal using recursion.
Use of loops directly for reversing the array is not allowed.

Sample Input-1:
---------------

5
1 2 3 4 5

Sample Output-1:
----------------

5 4 3 2 1

Explanation:
------------

The train originally has coaches in order:
1 → 2 → 3 → 4 → 5

After reversing, the order becomes:
5 → 4 → 3 → 2 → 1


Sample Input-2:
---------------

3
10 20 30

Sample Output-2:
----------------

30 20 10 */

import java.util.*;

public class Day13P3 {
    static int[] reverse(int[] arr,int i,int j){
        if(i>=j) return arr;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return reverse(arr,i+1,j-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
