/*A secure communication system generates valid encryption strings using a 
fixed block pattern "pqr".

The system starts with an empty string and repeatedly inserts the block
"pqr" at any position.

You are given a string S consisting only of characters 'p', 'q', and 'r'.
Determine whether the given string could have been formed only by repeatedly
inserting "pqr" any number of times.

Input Format:
A single string S.

Output Format:
Print true if valid. Print false otherwise.

Sample Input 1:
ppqrrpqr
Sample Output 1:
true

Sample Input 2:
pqrpqrpqrr
Sample Output 2:
true

Sample Input 3:
pqrprq
Sample Output 3:
false */

import java.util.*;

public class Day4P1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         if(s.length()%3!=0){
            System.out.println(false);
            return ;
         }
        //  int p=0,q=0,r=0;
        //  for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='p')p++;
        //     if(s.charAt(i)=='q')q++;
        //     if(s.charAt(i)=='r')r++;
        //     if(q>p||r>q){
        //         System.out.println(false);
        //         return ;
        //     }
        //  }
        //  System.out.println(p==q&&q==r);
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            st.push(c);
            if(st.size()>=3){
                int n=st.size();
                if(st.get(n-1)=='r'&&st.get(n-2)=='q'&&st.get(n-3)=='p'){
                    st.pop();
                    st.pop();
                    st.pop();
                }
            }
        }
        System.out.println(st.isEmpty());
    }
}
