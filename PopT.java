import java.util.*;

class PopT{
    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static class Pair{
        TreeNode node;
        int state;
        Pair(TreeNode node,int state){
            this.node=node;
            this.state=state;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeNode[] nodes=new TreeNode[n];
        int[][] children=new int[n][2];
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            int left=sc.nextInt();
            int right=sc.nextInt();

            nodes[i]=new TreeNode(val);
            children[i][0]=left;
            children[i][1]=right;
        }
        for(int i=0;i<n;i++){
            int left=children[i][0];
            int right=children[i][1];

            if(left!=-1) nodes[i].left=nodes[left];
            if(right!=-1) nodes[i].right=nodes[right];
        }

        Stack<Pair> st=new Stack<>();
        List<Integer> pre=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> post=new ArrayList<>();

        st.push(new Pair(nodes[0],1));
        while(!st.isEmpty()){
            Pair p=st.pop();
            if(p.state==1){
                pre.add(p.node.val);
                p.state++;
                st.push(p);
                if(p.node.left!=null){
                    st.push(new Pair(p.node.left,1));
                }
            }
            else if(p.state==2){
                in.add(p.node.val);
                p.state++;
                st.push(p);
                if(p.node.right!=null){
                    st.push(new Pair(p.node.right,1));
                }
            }
            else{
                post.add(p.node.val);
            }
        }
        System.out.println("Pre->"+pre);
        System.out.println("In->"+in);
        System.out.println("Post->"+post);
    }
}