/*Treasure Map Search

An explorer discovers an ancient treasure map arranged in a grid format.
Each cell of the grid contains a unique treasure code.

The map follows two important rules:

1. Each row is sorted in increasing order.
2. The first number of every row is greater than the last number of the previous row.

Because of these properties, the entire map behaves like a single sorted sequence.

Given a treasure code T, determine whether the code exists in the map.

Print true if the code is found, otherwise print false.

Input Format:
-------------

First line contains two integers R and C representing the number of rows and columns.

Next R lines contain C space-separated integers representing the treasure map.

Last line contains an integer T representing the target treasure code.

Output Format:
--------------

Print true if the target exists in the map.
Otherwise print false.

Sample Input-1:
---------------

3 4
1 3 5 7
10 11 16 20
23 30 34 60
3

Sample Output-1:
----------------

true

Explanation:
------------

The value 3 exists in the first row of the map.

Sample Input-2:
---------------

3 4
1 3 5 7
10 11 16 20
23 30 34 60
13

Sample Output-2:
----------------

false */

import java.util.*;

public class Day11P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        int low=0,high=n*m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int r=mid/m;
            int c=mid%m;
            if(arr[r][c]==k){
                System.out.println(true);
                return ;
            }
            else if(arr[r][c]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(false);
    }
}
