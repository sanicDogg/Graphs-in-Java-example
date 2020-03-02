import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Graph g = Graph.createGraph();
        Set<String> set = g.depthFirstTraversal(g, "Bob");

        for (String string :
                set) {
            System.out.print(string + " ");
        }
    }


}