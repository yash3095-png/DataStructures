/*A system maintains a processing unit that must behave like a stack 
(Last-In-First-Out).

However, due to hardware constraints, only queue operations are available.
You need to simulate stack behavior using queue operations.

Operations:
1 x → push x
2 → pop
3 → print top element
4 → print true if empty else false

Input Format:
First line: integer n (number of operations)
Next n lines: operations

Output Format:
Print results for type 3 and type 4 operations

Sample Input-1:
5
1 10
1 20
3
2
3

Sample Output-1:
20
10

Explanation:
Push 10, push 20 → top = 20
Pop removes 20 → next top = 10

Sample Input-2:
3
1 5
2
4

Sample Output-2:
true
 */

import java.util.*;

class Test{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        while(n>0){
            int a=sc.nextInt();
            if(a==1){
                int b=sc.nextInt();
                q.add(b);
                for(int i=0;i<q.size()-1;i++){
                    q.add(q.remove());
                }
            }
            else if(a==2){
                if(!q.isEmpty()) q.remove();
            }
            else if(a==3){
                if(!q.isEmpty()) System.out.println(q.peek());
            }
            else if(a==4){
                System.out.println(q.isEmpty());
            }
            n--;
        }
        
    }
}