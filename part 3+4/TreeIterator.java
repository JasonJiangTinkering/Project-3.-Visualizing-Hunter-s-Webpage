import java.util.Iterator;
import java.util.LinkedList;

public class TreeIterator implements Iterator<TreeNode> {
    private LinkedList<TreeNode> nodes = new LinkedList<>();

    public TreeNode next() {
        TreeNode n = nodes.poll();

        for (TreeNode child: nodes.getChildren()) nodes.addChildren(child);

        return n;
    }

    public LinkedList<TreeNode> returnNodes() {
        return nodes;
    }
}
