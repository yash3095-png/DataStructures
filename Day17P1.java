/*A secure transmission system encodes signals using a sequence of control
brackets.

Each signal must be properly structured so that opening controls are correctly
closed.

The allowed control symbols are:
( ), { }, [ ]

A transmission is considered valid if:
•	Every opening symbol has a matching closing symbol
•	Symbols close in the correct order
•	No closing symbol appears without a matching opening before it

You are given a sequence of symbols. Determine whether the transmission is valid.

Input Format:
A single string s

Output Format:
Print "true" if valid, otherwise "false"

Sample Input-1:
()[]{}

Sample Output-1:
true

Explanation:
All symbols are properly opened and closed in correct order.

Sample Input-2:
([)]

Sample Output-2:
false
 */


import java.util.*;

class Test{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if (st.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                char top=st.pop();
                if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='[')){
                    System.out.println(false);
                    return ;
                }
            }
        }
        System.out.println(st.isEmpty());
    }
}


