/*You are given a string s consisting only of lowercase English letters.

A substring is considered special if it contains no repeating characters
(i.e., every character appears only once in that substring).

Your task is to count how many special substrings exist in the given string.

A substring is a contiguous sequence of characters within a string.

 Input Format
Line-1: A lowercase string s
 Output Format
Print an integer — the total number of special substrings.
 Constraints
1 <= s.length <= 10^5
s consists only of lowercase English letters.
 Sample Input – 1
abcd
 Sample Output – 1
10
Explanation

All characters are unique.

Length 1 → a, b, c, d → 4
Length 2 → ab, bc, cd → 3
Length 3 → abc, bcd → 2
Length 4 → abcd → 1

Total = 4 + 3 + 2 + 1 = 10

 Sample Input – 2
ooo
 Sample Output – 2
3
Explanation

Only substrings of length 1 are valid:
o, o, o

 Sample Input – 3
abab
 Sample Output – 3
7
Explanation

Length 1 → a, b, a, b → 4
Length 2 → ab, ba, ab → 3

Total = 7
 */
import java.util.*;

public class Day3P3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int cnt=0;
        HashSet<Character> set=new HashSet<>();
        int left=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            cnt+=i-left+1;
        }
        System.out.println(cnt);
    }
}
