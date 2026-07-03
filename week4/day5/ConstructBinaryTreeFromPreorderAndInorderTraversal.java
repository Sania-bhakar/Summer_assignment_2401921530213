class Solution {

    int index = 0;

    public TreeNode buildTree(int[] preorder,
                              int[] inorder) {

        return build(preorder, inorder, 0,
                     inorder.length - 1);
    }

    public TreeNode build(int[] preorder,
                          int[] inorder,
                          int start,
                          int end) {

        if(start > end) {
            return null;
        }

        int rootValue = preorder[index++];

        TreeNode root = new TreeNode(rootValue);

        int pos = 0;

        for(int i = start; i <= end; i++) {

            if(inorder[i] == rootValue) {
                pos = i;
                break;
            }
        }

        root.left =
            build(preorder, inorder, start, pos - 1);

        root.right =
            build(preorder, inorder, pos + 1, end);

        return root;
    }
}