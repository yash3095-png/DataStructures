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
27 */

import java.util.*;

public class Day5P3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Integer> st=new Stack<>();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                st.push(s.charAt(i)-'0');
                sum+=s.charAt(i)-'0';
            }
            else if(s.charAt(i)=='A'){
                int last=st.pop();
                int secondLast=st.peek();
                sum+=last+secondLast;
                st.push(last);
                st.push(last+secondLast);
            }
            else if(s.charAt(i)=='D'){
                sum+=2*st.peek();
                st.push(2*st.peek());
            }
            else if(s.charAt(i)=='R'){
                sum-=st.pop();
            }
        }
        System.out.println(sum);
    }
}
