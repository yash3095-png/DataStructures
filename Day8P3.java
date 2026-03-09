/*You have been tasked with managing scores in a unique game. 
The game begins with an empty scorecard. You are provided with a list 
of operations represented as a string of characters, denoted as operations[i], 
each corresponding to a specific action. These actions include:

A digit S: This means you should add a new score of S to the scorecard.
'A': This means you should add a new score to the scorecard, 
	which is the addition of the last two scores.
'D': This means you should add a new score to the scorecard, 
	which is double the value of the previous score.
'R': This means you should invalidate the previous score, 
	removing it from the scorecard.
	
Your objective is to calculate the sum of all the scores that remain on
the scorecard after performing all the specified operations.


Input Format:
-------------
A string consists of characters, represents series of operations.

Output Format:
--------------
An integer result.


Sample Input-1:
---------------
526RDAA

Sample Output-1:
----------------
27*/

import java.util.*;

public class Day8P3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                st.push(c-'0');
                ans+=st.peek();
            }
            else if(c=='R'){
                ans-=st.pop();
            }
            else if(c=='A'){
                int last=st.pop();
                int secondLast=st.peek();
                int next=last+secondLast;
                ans+=next;
                st.push(last);
                st.push(next);
            }
            else {
                int next=(st.peek()*2);
                ans+=next;
                st.push(next);
            }
        }
        System.out.println(ans);
    }
}
