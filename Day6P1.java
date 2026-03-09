/*Clavius, the person who suggested grouping of data using brackets.
He has suggested that the grouping should be well formed.
Well formed groupings are as follows, (), [], {}, {()}, {[]()}, {[]}(), etc.

You will be given a string S, return true if the string S is a well formed 
grouping, otherwise false.

Note: S contains only characters ( ) [ ] { }

Input Format:
-------------
A string S, contains only characters (){}[]

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
{[([])[]]}

Sample Output-1:
----------------
true


Sample Input-2:
---------------
{[([])[]}]

Sample Output-2:
----------------
false


Sample Input-3:
---------------
input ={[[[([])}{([[{}]])]]]}

Sample Output-2:
----------------
false


Sample Input-2:
---------------
input ={{[({}(){}[[()]])][([()])]}}

Sample Output-2:
----------------
true */

import java.util.*;

class Day6P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='['||c=='{'||c=='(') st.push(c);
            else{
                char top=st.pop();
                if(top=='['&&c!=']'||top=='{'&&c!='}'||top=='('&&c!=')'){
                    System.out.println(false);
                    return ;
                }
            }
        }
        System.out.println(true);
    }
}