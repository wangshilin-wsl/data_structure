package tree;
/*请完成一个函数，输入一个二叉树，该函数输出它的镜像。
        例如输入：
             4
           /   \
          2     7
         / \   / \
        1   3 6   9
        镜像输出：

              4
           /   \
          7     2
         / \   / \
        9   6 3   1

        示例 1：
        输入：root = [4,2,7,1,3,6,9]
        输出：[4,7,2,9,6,3,1]*/
public class MirrorTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    public TreeNode mirrorTree(TreeNode root) {//返回的root
        if(root==null) return null;
        TreeNode temp=root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(temp);
        return root;
    }
}