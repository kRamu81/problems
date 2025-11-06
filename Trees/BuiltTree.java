package Trees;
import java.util.*;

public class BuiltTree {
    public static TreeNode construct(String input){
        if(input == null || input.isEmpty())  return null;
        String[] parts = input.split(" ");
        List<TreeNode> nodes = new ArrayList<>();
        for(String val : parts){
            if(val.equals("-1")) nodes.add(null);
            else nodes.add(new TreeNode(Integer.parseInt(val)));
        }
        for(int i = 0, j = 1; j < nodes.size(); i++){
            TreeNode curr = nodes.get(i);
            if(curr != null){
                curr.left = nodes.get(j++);
                if(j < nodes.size()) curr.right = nodes.get(j++);
            }
        }
        return nodes.getFirst();
    }
}
