import com.sun.org.apache.xpath.internal.operations.Bool;
import sun.nio.ch.sctp.SctpNet;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.*;
import java.lang.Boolean;
/**
 * Created by poonamyadav on 22/07/17.
 */
public class IsTreeOrNot {
    private int V;
    private LinkedList<Integer> adj[];

    IsTreeOrNot(int v) {
        V=v;
        adj = new LinkedList[v];
        for(int i=0; i<v; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    Boolean isCycleUtil(int v, Boolean[] visited, int parent) {
        visited[v] = true;
        Integer i;

        Iterator<Integer> it = adj[v].iterator();

        while(it.hasNext()) {
            i = it.next();
            if(!visited[i]) {
                if(isCycleUtil(i, visited, v))
                    return true;
            } else if(i != parent)
                return true;
        }
    return false;
    }

    Boolean isTree() {
        Boolean[] visited = new Boolean[V];
        for(int i=0; i<V; i++) {
            visited[i] = false;
        }
        if(isCycleUtil(0, visited, -1))
        {
            return false;
        }
        for(int u = 0; u < V; u++)
            if(!visited[u])
                return false;
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        IsTreeOrNot graph = new IsTreeOrNot(n);
        for(int i=0; i<m; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.addEdge(v-1, w-1);
            sc.nextLine();
        }
        if(graph.isTree() == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
