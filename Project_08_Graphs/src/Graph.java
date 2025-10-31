/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Graph {
    int[][] a; // adjacency matrix
    String[] v; // vertex labels
    int n; // number of vertices
    
    public Graph() {
        n = 0;
        a = new int[20][20];
        v = new String[20];
    }
    
    // Queue implementation for BFS
    class MyQueue {
        private java.util.LinkedList<Object> items;
        
        public MyQueue() {
            items = new java.util.LinkedList<>();
        }
        
        public void enqueue(Object item) {
            items.addLast(item);
        }
        
        public Object dequeue() {
            return items.removeFirst();
        }
        
        public boolean isEmpty() {
            return items.isEmpty();
        }
    }
    
    // Add vertex to the graph
    void addVertex(String vertex) {
        v[n] = vertex;
        n++;
    }
    
    // Add edge with weight
    void addEdge(int start, int end, int weight) {
        a[start][end] = weight;
    }
    
    // Breadth-first traversal
    void breadthFirst(int k) {
        MyQueue q = new MyQueue();
        int i, h;
        boolean[] enqueued = new boolean[n];
        for(i = 0; i < n; i++) enqueued[i] = false;
        
        q.enqueue(new Integer(k));
        enqueued[k] = true;
        
        while(!q.isEmpty()) {
            h = Integer.parseInt(q.dequeue().toString().trim());
            visit(h);
            for(i = 0; i < n; i++)
                if((!enqueued[i]) && a[h][i] > 0) {
                    q.enqueue(new Integer(i));
                    enqueued[i] = true;
                }
        }
        System.out.println();
    }
    
    // Visit vertex
    void visit(int i) {
        System.out.print(" " + v[i]);
    }
    
    // Recursive depth-first traversal
    void depthFirst(boolean visited[], int i) {
        visit(i);
        visited[i] = true;
        for(int j = 0; j < n; j++)
            if(a[i][j] > 0 && (!visited[j]))
                depthFirst(visited, j);
    }
    
    // Depth-first traversal from vertex k
    void depthFirst(int k) {
        boolean[] visited = new boolean[20];
        for(int i = 0; i < n; i++) visited[i] = false;
        
        depthFirst(visited, k);
        
        // Visit unvisited vertices
        for(int i = 0; i < n; i++)
            if(!visited[i])
                depthFirst(visited, i);
        System.out.println();
    }
    
    // Dijkstra's algorithm implementation
    void dijkstra(int first) {
        int[] currDist = new int[n];
        int[] predecessor = new int[n];
        boolean[] checked = new boolean[n];
        
        // Initialize distances
        for(int i = 0; i < n; i++) {
            currDist[i] = Integer.MAX_VALUE;
            checked[i] = false;
            predecessor[i] = -1;
        }
        currDist[first] = 0;
        
        while(true) {
            // Find unchecked vertex with minimum distance
            int u = -1;
            int minDist = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++) {
                if(!checked[i] && currDist[i] < minDist) {
                    u = i;
                    minDist = currDist[i];
                }
            }
            
            if(u == -1) break; // All vertices checked
            
            checked[u] = true;
            
            // Update distances to adjacent vertices
            for(int v = 0; v < n; v++) {
                if(!checked[v] && a[u][v] > 0) {
                    int newDist = currDist[u] + a[u][v];
                    if(newDist < currDist[v]) {
                        currDist[v] = newDist;
                        predecessor[v] = u;
                    }
                }
            }
        }
        
        // Print results
        System.out.println("Shortest paths from vertex " + v[first] + ":");
        for(int i = 0; i < n; i++) {
            if(i != first) {
                System.out.print("To " + v[i] + ": ");
                if(currDist[i] == Integer.MAX_VALUE) {
                    System.out.println("No path exists");
                } else {
                    System.out.println("Distance = " + currDist[i] + ", Path: " + getPath(predecessor, first, i));
                }
            }
        }
    }
    
    // Helper method to construct path for Dijkstra's algorithm
    private String getPath(int[] predecessor, int start, int end) {
        if(predecessor[end] == -1) return v[start] + " -> " + v[end];
        return getPath(predecessor, start, predecessor[end]) + " -> " + v[end];
    }
    
    // Floyd-Warshall Algorithm implementation
    void floydWarshall() {
        int[][] D = new int[n][n];  // Distance matrix
        int[][] P = new int[n][n];  // Predecessor matrix
        
        // Initialize D and P matrices
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    D[i][j] = 0;
                } else if(a[i][j] > 0) {
                    D[i][j] = a[i][j];
                } else {
                    D[i][j] = Integer.MAX_VALUE;
                }
                P[i][j] = 0;
            }
        }
        
        // Floyd-Warshall algorithm
        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(D[i][k] != Integer.MAX_VALUE && D[k][j] != Integer.MAX_VALUE) {
                        if(D[i][j] > D[i][k] + D[k][j]) {
                            D[i][j] = D[i][k] + D[k][j];
                            P[i][j] = k;
                        }
                    }
                }
            }
        }
        
        // Print results
        System.out.println("All-Pairs Shortest Paths:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    System.out.print("From " + v[i] + " to " + v[j] + ": ");
                    if(D[i][j] == Integer.MAX_VALUE) {
                        System.out.println("No path exists");
                    } else {
                        System.out.println("Distance = " + D[i][j] + ", Path: " + getFloydPath(P, i, j));
                    }
                }
            }
        }
    }
    
    // Helper method to reconstruct path for Floyd-Warshall algorithm
    private String getFloydPath(int[][] P, int i, int j) {
        if(P[i][j] == 0) return v[i] + " -> " + v[j];
        int k = P[i][j];
        return getFloydPath(P, i, k) + " -> " + getFloydPath(P, k, j).substring(v[k].length() + 4);
    }

    // Main method with example usage
    public static void main(String[] args) {
        Graph g = new Graph();
        
        // Add vertices
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");
        g.addVertex("E");
        
        // Add edges with weights
        g.addEdge(0, 1, 2);  // A to B with weight 2
        g.addEdge(0, 2, 4);  // A to C with weight 4
        g.addEdge(1, 2, 1);  // B to C with weight 1
        g.addEdge(1, 3, 7);  // B to D with weight 7
        g.addEdge(2, 4, 3);  // C to E with weight 3
        g.addEdge(3, 4, 1);  // D to E with weight 1
        
        System.out.println("Breadth-First Traversal starting from A:");
        g.breadthFirst(0);
        
        System.out.println("\nDepth-First Traversal starting from A:");
        g.depthFirst(0);
        
        System.out.println("\nDijkstra's Algorithm starting from A:");
        g.dijkstra(0);
        
        System.out.println("\nFloyd-Warshall Algorithm for All-Pairs Shortest Paths:");
        g.floydWarshall();
    }
}
