/*A digital security lab is analyzing two encrypted messages.

The first message S is the original encoded template, and the second message T 
is the received transmission.

For the transmission to be considered valid:

Every character in S must consistently map to exactly one character in T.

No two different characters in S may map to the same character in T.

The order of characters must remain unchanged.

The mapping must be consistent throughout the entire string.

Your task is to determine whether the received transmission follows a valid
one-to-one cipher mapping.

Return true if the mapping is valid; otherwise return false.

Input Format
Line-1: A string S
Line-2: A string T
 Output Format
Print true if the cipher mapping is valid.
Otherwise print false.

 Constraints
1 <= S.length <= 10^4
S.length == T.length
S and T contain only lowercase English letters.

Sample Input – 1
egg
add
Sample Output – 1
true
Explanation

'e' → 'a'
'g' → 'd'

The mapping is consistent and one-to-one.

Sample Input – 2
foo
bar
Sample Output – 2
false
Explanation
'o' maps to both 'a' and 'r', which violates consistent mapping.

Sample Input – 3
paper
title
Sample Output – 3
true
 */

import java.util.*;


public class Day3P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        HashMap<Character,Character> m1=new HashMap<>();
        HashMap<Character,Character> m2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(m1.containsKey(s.charAt(i))){
                if(m1.get(s.charAt(i))!=t.charAt(i)){
                    System.out.println(false);
                    return;
                }
            }
            else{
                m1.put(s.charAt(i),t.charAt(i));
            }
            if(m2.containsKey(t.charAt(i))){
                if(m2.get(t.charAt(i))!=s.charAt(i)){
                    System.out.println(false);
                    return ;
                }
            }
            else{
                m2.put(t.charAt(i),s.charAt(i));
            }
        }
    }
}
