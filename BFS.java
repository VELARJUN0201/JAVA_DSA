 import java.util.*;
public class BFS {
    public static List<String>  bfs(Map<String,List<String>> graph , String Start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        List<String> Traverseorder = new ArrayList<>();

        visited.add(Start);
        queue.add(Start);

        while (!queue.isEmpty()) {
            String node = queue.poll();
            Traverseorder.add(node);
            for (String neighbour : graph.getOrDefault(node,Collections.emptyList())) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
        return Traverseorder;
    }

    public static void main(String[] args) {
        Map<String,List<String>> graph = new HashMap<>();
        graph.put("A",Arrays.asList("B","C"));
        graph.put("B",Arrays.asList("A","D","E"));
        graph.put("C",Arrays.asList("A","F"));
        graph.put("D",Collections.singletonList("B"));
        graph.put("E",Collections.singletonList("B"));
        graph.put("F",Collections.singletonList("C"));

        List<String> result = bfs(graph,"A");
        System.out.println(result);
    }
}