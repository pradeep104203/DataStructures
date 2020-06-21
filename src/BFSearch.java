import java.util.Iterator;
import java.util.LinkedList;

public class BFSearch{

    public  int V;

    private LinkedList<Integer> adj[];

    BFSearch(int v)
    {
      V=v;

      adj=new LinkedList[v];
      for(int i=0;i<v;i++)
          adj[i]=new LinkedList<>();
    }

  boolean visited[]=new boolean[100];


    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }


     void BFT()
     {
         int count=0;
         //boolean visited[]=new boolean[V];
         for(int i=0;i<V;i++)
         {

             if(visited[i]==true)
                 count++;
             if(V==count)
                 System.out.println("Graph coneected");

             while(visited[i]==false)
             {

                 System.out.println("Graph not connected");
                 BFS(i);
             }
         }



     }


    void BFS(int s)
    {


       //boolean visited[]=new boolean[V];

        LinkedList<Integer> queue=new LinkedList<Integer>();

        visited[s]=true;
        queue.add(s);


        while(queue.size() !=0)
        {
            s=queue.poll();
            System.out.println(s+" ");
            Iterator<Integer> i = adj[s].listIterator();

            while(i.hasNext())
            {
                int n=i.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }

        }


    }

     public static void main(String args[])
     {
         BFSearch bfs=new BFSearch(6);
         bfs.addEdge(0, 1);
         bfs.addEdge(0, 2);
         bfs.addEdge(1, 2);
         bfs.addEdge(2, 0);
         bfs.addEdge(2, 3);
         bfs.addEdge(3, 3);
         bfs.addEdge(4,5);
         bfs.BFS(2);

          bfs.BFT();
         System.out.println("Following is Breadth First Traversal "+
                 "(starting from vertex 2)");

        // bfs.BFS(2);

     }

}
