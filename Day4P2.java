/*
A manufacturing plant has a single automated processing machine.
There are two types of components:

•	Type 0 → Metal Components

•	Type 1 → Plastic Components

Components arrive on a circular conveyor belt and wait to be processed.

The machine operates in a predefined mode sequence, meaning it can process 
only one type of component at a time. The mode changes according to a fixed
schedule.
Processing Rules:
1.	The component at the front of the conveyor is checked.
2.	If it matches the machine's current mode, it is processed and removed.
3.	If it does not match, it continues moving along the conveyor belt
    (rotates to the back).
4.	If a full cycle occurs and no component matches the current machine mode, 
    the system halts.
Your task is to determine how many components remain unprocessed.

 Input Format
Line 1: Space-separated integers representing component types (0 or 1)
Line 2: Space-separated integers representing machine operating mode sequence

 Output Format
Print a single integer — number of components remaining.

Sample Input 1:
1 1 0 0
0 1 0 1
Sample Output 1:
0
Sample Input 2:
1 1 1
0 0 0
Sample Output 2:
3

 */
import java.util.*;
public class Day4P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        String[] t=sc.nextLine().split(" ");
        int one=0,zero=0;
        for(int i=0;i<s.length;i++){
            if(s[i].equals("0")) zero++;
            else one++;
        }
        for(int i=0;i<t.length;i++){
            if(t[i].equals("0")&&zero>0)zero--;
            else if(t[i].equals("1")&&one>0) one--;
            else break;
        }
        System.out.println(one+zero);
    }
}
