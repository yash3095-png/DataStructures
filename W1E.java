import java.util.*;

class W1E{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()){
                char top=st.peek();
                char ch=s.charAt(i);
                if(Character.toLowerCase(top)==Character.toLowerCase(ch)&&top!=chDAy){
                    st.pop();
                    continue;
                }
            }
            st.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.size();i++){
            sb.append(st.get(i));
        }
        System.out.println(sb);
    }
}