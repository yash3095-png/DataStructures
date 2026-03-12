/*
A secure communication system sends encrypted data using layered encoding.

Each message consists of nested secure layers represented using square 
brackets [ ].

A secure layer:

Starts with [

Ends with ]

May contain other secure layers inside it

Multiple secure layers can appear one after another in the transmission.

For security auditing, the outermost encryption layer of every independent 
secure block must be removed.

Your task is to process the transmission and return the message after stripping
the outermost layer from each independent secure block.

INPUT FORMAT:

Line-1: A string S consisting only of '[' and ']'.
It is guaranteed that S is a valid secure transmission.

OUTPUT FORMAT:

Print the filtered transmission after removing the outermost layer from each 
independent secure block.

SAMPLE INPUT-1:

[[]][[][]][]

SAMPLE OUTPUT-1:

[][][]

SAMPLE INPUT-2:

[[][]][[]][[][[]]]

SAMPLE OUTPUT-2:

[][][][][[]]
*/



import java.util.*;

class D2P2{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int cnt=0;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(cnt>0) sb.append(c);
                cnt++;
            }
            else{
                cnt--;
                if(cnt>0) sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}

