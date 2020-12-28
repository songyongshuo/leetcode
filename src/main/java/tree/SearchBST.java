package tree;

import common.classes.TreeNode;

/**
 * 700. 二叉搜索树中的搜索
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 *
 * 例如，
 *
 * 给定二叉搜索树:
 *
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 *
 * 和值: 2
 * 你应该返回如下子树:
 *
 *       2
 *      / \
 *     1   3
 * 在上述示例中，如果要找的值是 5，但因为没有节点值为 5，我们应该返回 NULL。
 *
 * @author songyongshuo
 * @date 2020-08-17 17:44
 */
public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        return val > root.val ? searchBST(root.right, val) : searchBST(root.left, val);
    }

    public static void main(String[] args) {
        SearchBST searchBST = new SearchBST();
        Integer[] trees = {3, 9, 20, null, null, 15, 7};
        TreeNode treeNode = searchBST.searchBST(TreeNode.makeTree(trees), 20);
        System.out.println(treeNode);
    }
}
