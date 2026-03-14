/*In the ancient kingdom of Eldoria, a beautiful lantern festival is held
every year at the top of a sacred hill. A long stone staircase leads pilgrims 
from the village entrance to the glowing temple above.

However, the staircase has a special rule.

A pilgrim may climb either:
• exactly 1 step
• or exactly 2 steps

at a time.

The royal archivist wants to record all the possible distinct ways a pilgrim
can reach the temple if the staircase contains N steps.

Since the kingdom values elegant reasoning, the archivist insists that the
number of ways must be computed using a **pure recursive approach** that 
follows the natural decision process at each step.

Your task is to determine the total number of distinct ways a pilgrim can reach
the top of the staircase.

Input Format:
-------------

A single integer N representing the total number of steps in the staircase.

Output Format:
--------------

Print a single integer representing the number of distinct ways to reach the top.

Sample Input-1:
---------------

3

Sample Output-1:
----------------

3

Explanation:
------------

For 3 steps, the pilgrim can climb in the following ways:

1 → 1 → 1  
1 → 2  
2 → 1  

So the total number of ways is 3.

Sample Input-2:
---------------

4

Sample Output-2:
----------------

5 */

import java.util.*;

public class Day14P1 {
    static int steps(int n){
        if(n<=1) return 1;
        return steps(n-1)+steps(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(steps(n));
    }
}
