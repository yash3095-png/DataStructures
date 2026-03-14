/*A number is called a Lucky Number if the following transformation process 
eventually reaches the number 1.

Starting with a positive integer N:

1. Replace the number with the sum of the squares of its digits.
2. Repeat the same transformation with the newly obtained number.

If the sequence eventually reaches 1, the number is considered Lucky.
If the sequence enters a repeating cycle that never reaches 1, the number
is not Lucky.

You must determine whether the given number N is a Lucky Number.

Note:
The solution must be implemented using recursion to repeatedly apply 
the transformation until either 1 is reached or a cycle is detected.

Input Format:
-------------

A single integer N.

Output Format:
--------------

Print true if N is a Lucky Number.
Otherwise print false.

Sample Input-1:
---------------

19

Sample Output-1:
----------------

true

Explanation:
------------

19 → 82 → 68 → 100 → 1

Since the sequence reaches 1, the number is a Lucky Number.


Sample Input-2:
---------------

2

Sample Output-2:
----------------

false */

import java.util.*;

public class Day13P2 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(lucky(n));
    }
    static int sqrt(int n){
        if(n<=0) return n;
        int digit=n%10;
        return digit*digit+sqrt(n/10);
    }
    static boolean lucky(int n){
        if(n==1) return true;
        else if(n==4) return false;
        return lucky(sqrt(n));
    }
}
