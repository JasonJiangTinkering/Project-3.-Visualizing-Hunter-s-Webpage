public class Tree {
    private TreeNode root;

    public Tree(int num, String url) {
        rootNode = new TreeNode(num, url);
    }

    public TreeNode getRoot() {
        return root;
    }

    public TreeIterator<TreeNode> iterator() {
        return new TreeIterator(root);
    }
}
