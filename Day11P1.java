/*Largest Possible Square

You are given an integer X representing the number of unit tiles available.

You want to arrange these tiles to form a perfect square floor.
Each side of the square must contain the same number of tiles.

However, you cannot use more tiles than available.

Find the maximum possible side length of the square that can be formed.

Input Format:
-------------

A single integer X.

Output Format:
--------------

Print a single integer representing the maximum side length of the square.

Sample Input-1:
---------------

4

Sample Output-1:
----------------

2

Explanation:
------------

A square of side 2 uses 2 × 2 = 4 tiles.

Sample Input-2:
---------------

8

Sample Output-2:
----------------

2 */


import java.util.*;

class Day11P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int low=1,high=n;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid<=n){
                ans=Math.max(ans,mid);
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}