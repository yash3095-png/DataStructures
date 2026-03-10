/*Given a sorted list of integers, 

Your task is to find the continuous range of numbers, make them as groups
and print all the groups as show in the sample testcases.

For example:
Given list is [ 1, 2, 3 ]: 1, 2, 3 is continuous range, grouped as 1->3
Given list is [ 1, 2, 4, 5, 7 ]: 1, 2 is continuous range, grouped as 1->2, 
4,5 grouped as 4->5, 7 is left alone.

Note: List contain no duplicates.

Input Format:
-------------
Line-1 -> Space separated integers in sorted order

Output Format:
--------------
Print the list of continuous range groups.


Sample Input-1:
---------------
5
1 2 4 5 7

Sample Output-1:
----------------
[1->2, 4->5, 7]



Sample Input-2:
---------------
9
1 2 3 5 6 7 9 10 12

Sample Output-2:
----------------
[1->3, 5->7, 9->10, 12] */

import java.util.*;

public class Day10P3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<String> l=new ArrayList<>();
        int start=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]+1){
                if(start==arr[i-1]){
                    l.add(String.valueOf(start));
                }
                else {
                    l.add(String.valueOf(start)+"->"+String.valueOf(arr[i-1]));
                }
                start=arr[i];
            }
        }
        if(start==arr[n-1]){
            l.add(String.valueOf(start));
        }
        else{
            l.add(String.valueOf(start)+"->"+String.valueOf(arr[n-1]));
        }
        System.out.println(l);
    }
}
