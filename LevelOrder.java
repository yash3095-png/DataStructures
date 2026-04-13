/*In a college auditorium, students are seated row-wise for a technical event.

The seating arrangement follows a hierarchical structure:
- The student at the entrance invites two students behind them
- Each of those students invites two more, forming rows

Your task is to record the student IDs row by row, starting from the entrance.

Input Format:
-------------

First line: Integer N (number of students)
Next N lines:
id left_index right_index

Root is always index 0

Output Format:
--------------

Print student IDs level by level
Each level in a new line (space-separated)

Sample Input-1:
---------------

3
1 1 2
2 -1 -1
3 -1 -1

Sample Output-1:
----------------

1
2 3



Sample Input-2:
---------------

1
10 -1 -1

Sample Output-2:
----------------

10 */

import java.util.*;

class LevelOrder{
    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
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
        TreeNode root=nodes[0];

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                System.out.print(node.val+" ");
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            System.out.println();
        }

    }
}