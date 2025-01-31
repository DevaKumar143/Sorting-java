// public class Prism {
    
// }
import java.util.*;

import java.util.Arrays;

public class PrimsAlgorithm {
    private static final int V = 5; // Number of vertices in the graph
    
    // Utility function to find the vertex with minimum key value, from the set of vertices not yet included in MST
    private int minKey(int key[], boolean mstSet[]) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        
        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    
    // Function to print the constructed MST stored in parent[]
    private void printMST(int parent[], int graph[][]) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }
    
    // Function to construct and print MST for a graph represented using adjacency matrix representation
    public void primMST(int graph[][]) {
        int parent[] = new int[V]; // Array to store constructed MST
        int key[] = new int[V]; // Key values used to pick minimum weight edge in cut
        boolean mstSet[] = new boolean[V]; // To represent set of vertices not yet included in MST
        
        // Initialize all keys as INFINITE
        Arrays.fill(key, Integer.MAX_VALUE);
        
        // Include first vertex in MST
        key[0] = 0; // Make key 0 so that this vertex is picked as first vertex
        parent[0] = -1; // First node is always root of MST
        
        // The MST will have V vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum key vertex from the set of vertices not yet included in MST
            int u = minKey(key, mstSet);
            
            // Add the picked vertex to the MST set
            mstSet[u] = true;
            
            // Update key and parent arrays of the adjacent vertices of the picked vertex. Consider only those vertices which are not yet included in MST
            for (int v = 0; v < V; v++) {
                // graph[u][v] is non zero only for adjacent vertices of m
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }
        
        // Print the constructed MST
        printMST(parent, graph);
    }
    
    // Main method to test PrimsAlgorithm
    public static void main(String[] args) {
        PrimsAlgorithm t = new PrimsAlgorithm();
        int graph[][] = new int[][] {
             { 0, 2, 0, 6, 0 }, 
             { 2, 0, 3, 8, 5 }, 
            { 0, 3, 0, 0, 7 }, 
            { 6, 8, 0, 0, 9 }, 
            { 0, 5, 7, 9, 0 }
        };

        // Print the solution
        t.primMST(graph);
    }
}

