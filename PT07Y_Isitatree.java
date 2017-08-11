import java.util.Scanner;

/**
 * Created by poonamyadav on 21/07/17.
 */
public class PT07Y_Isitatree {
    int V,E;
    Edge edge[];
    class Edge{
        int src, dest;
    };

    PT07Y_Isitatree(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[E];
        for(int i=0; i<e; i++) {
            edge[i] = new Edge();
        }
    }

    int find(int parent[], int i) {
        if(parent[i] == -1)
            return i;
        else return find(parent, parent[i]);
    }

    void union(int parent[], int x,int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    int isTree(PT07Y_Isitatree graph, int parent[]) {

        for(int i=0; i<graph.V; ++i)
            parent[i] = -1;

        for(int i=0; i<graph.E; i++) {
            int x = find(parent, graph.edge[i].src - 1);
            int y = find(parent, graph.edge[i].dest - 1);
            if(x==y)
                return 1;
            graph.union(parent, x, y);
        }

        return 0;
    }

    int checkConnected(PT07Y_Isitatree graph, int parent[]) {
        int i=0;
        for(i=0; i<graph.V; i++)
            if(parent[i] == -1)
                return 0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        PT07Y_Isitatree graph = new PT07Y_Isitatree(n,m);
        int i=0;
        for(i=0; i<m; i++) {
            graph.edge[i].src = sc.nextInt();
            graph.edge[i].dest = sc.nextInt();
            sc.nextLine();
        }
        int parent[] = new int[graph.V];
        int res = graph.isTree(graph, parent);
        int ifConnected = graph.checkConnected(graph, parent);
        if(res == 1 || ifConnected == 0)
            System.out.println("NO");
        else
            System.out.println("YES");
    }

}
