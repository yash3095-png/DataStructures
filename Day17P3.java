/*A sorted storage system keeps unique values in ascending order.

When a new value arrives, the system must determine its exact position.
If the value already exists, return its index.
If not, return the index where it should be inserted.

Input Format:
First line: integer n
Second line: n sorted integers
Third line: target value

Output Format:
Print the index

Sample Input-1:
4   
1 3 5 6
5

Sample Output-1:
2

Explanation:
5 exists at index 2.

Sample Input-2:
4
1 3 5 6
2

Sample Output-2:
1
 */

import java.util.*;

class Test{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else high=mid-1;
        }
        System.out.println(low);
    }
}