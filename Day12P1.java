/*A logistics company stores packages in a long warehouse corridor.
Each position in the corridor holds packages with a certain weight.

Warehouse managers frequently ask queries like:

"What is the total weight of packages stored from position L to position R?"

Since these queries happen many times, calculating the sum repeatedly by scanning the corridor would be too slow.

Your task is to process the queries efficiently and print the total weight for each query.

Input Format:
-------------

First line contains two integers:
N Q

N → number of positions in the warehouse
Q → number of queries

Second line contains N space-separated integers representing the package weights.

Next Q lines each contain two integers:
L R

L and R represent the range of positions (0-indexed, inclusive).

Output Format:
--------------

For each query print the total weight in the range L to R.

Sample Input-1:
---------------

5 3
2 4 1 5 3
0 2
1 3
2 4

Sample Output-1:
----------------

7
10
9

Explanation:
------------

Array = [2,4,1,5,3]

Query1 (0,2) → 2+4+1 = 7  
Query2 (1,3) → 4+1+5 = 10  
Query3 (2,4) → 1+5+3 = 9


Sample Input-2:
---------------

4 2
10 20 30 40
1 2
0 3

Sample Output-2:
----------------

50
100 */

import java.util.*;

class Day12P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int[] arr=new int[n];
        int[] prefix=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        ArrayList<Integer> l=new ArrayList<>();

        for(int i=0;i<s;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans;
            if(a==0) ans=prefix[b];
            else{
                ans=prefix[b]-prefix[a-1];
            }
            l.add(ans);
        }
        
        System.out.println(l);
    }
}