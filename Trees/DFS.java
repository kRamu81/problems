package Trees;
import java.util.*;

public class DFS {
    static class Tree{
        private List<List<Integer>> adjList;
        //constructor to initalize the adjacency list
        public Tree(int n){
            adjList = new ArrayList<>(n+1);
            for(int i=0;i<=n;i++){
                adjList.add(new ArrayList<>());
            }
        }
        public void addEdge(int u,int v){
            adjList.get(u).add(v);
        }

        public void dfs(int node){
            System.out.print(node+" ");
            for(int child : adjList.get(node)){
                dfs(child);
            }
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Tree tree = new Tree(n);

        for(int i=0;i<n-1;i++){
            int u = s.nextInt();
            int v = s.nextInt();
            tree.addEdge(u,v);
        }
        tree.dfs(1);
    }
}
