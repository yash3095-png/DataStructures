/*In the grand Library of Aurelion, ancient scholars store magical crystal codes
used to unlock different chambers of knowledge. Each crystal is engraved with a 
unique numeric code.

During the annual audit, the head archivist must examine a collection of crystal
codes and count how many of them contain an **even number of digits**.
These crystals are considered "balanced" and are placed into a special vault.

You are given a list of crystal codes. Your task is to determine how many of 
these codes have an **even number of digits**.

Input Format:
-------------

The first line contains an integer N representing the number of crystal codes.

The second line contains N space-separated integers representing the crystal
codes.

Output Format:
--------------

Print a single integer representing the number of crystal codes that contain
an even number of digits.

Sample Input-1:
---------------

5
12 345 2 6 7896

Sample Output-1:
----------------

2

Explanation:
------------

Crystal codes with even number of digits:

12   → 2 digits  
7896 → 4 digits  

Total balanced crystals = 2


Sample Input-2:
---------------

4
1 22 333 4444

Sample Output-2:
----------------

2 */

import java.util.*;

public class Day14P2 {
    static int even(int[] arr,int i){
        if(i==arr.length) return 0;
        int cnt=0;
        if(String.valueOf(arr[i]).length()%2==0){
            cnt+=1;
        }
        return cnt+even(arr,i+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=even(arr,0);
        System.out.println(ans);
    }
}
