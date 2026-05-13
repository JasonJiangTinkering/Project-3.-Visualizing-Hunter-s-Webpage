import java.util.ArrayList;

public class TreeNode {
    private int index;
    private String url;
    private ArrayList<TreeNode> children = new ArrayList<>();

    public TreeNode(int num, String link) {
        this.index = num;
        this.url = link;
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }

    public String getUrl() {
        return url;
    }

    public int getIndex() {
        return index;
    }

    public ArrayList<TreeNode> getChildren() {
        return children;
    }
}
