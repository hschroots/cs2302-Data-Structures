public class graphTest{
  
   //Adjacency Matrix Methods 
    
   public static void printGraph(boolean[][] G){
      for (int i=0;i<G.length;i++){
         System.out.print("G["+i+"]: ");
         for (int j=0;j<G.length;j++)
            if(G[i][j])
               System.out.print(j+" ");
         System.out.println();
      }   
   }

   public static void reverseEdges (boolean [][] G){
      boolean temp;
      for(int i=0;i<G.length;i++)
         for(int j=i+1;j<G.length;j++){
            temp = G[i][j];
            G[i][j] = G[j][i];
            G[j][i] = temp;
         }
   }

   public static int outDegree(boolean [][] G, int v){
      int count=0;
      for (int j=0;j<G.length;j++)
         if(G[v][j])
            count++;
      return count;
   }
  
   public static boolean [][] g2 (int n){
      boolean  [][] G =  new boolean[n][n];
      for(int i=0;i<n;i++)
         for(int j=0;j<n;j++)
              G[i][j] = (i == (j+1)%n);
      return G;
   }


   //Adjacency List Methods  
   
   public static void printGraph(graphNode [] G){
      for (int i=0;i<G.length;i++){
         System.out.print("G["+i+"]: ");
         for(graphNode x=G[i]; x !=null; x=x.next)
            System.out.print(x.dest+" ");
         System.out.println();
      }   
   }
   
   public static void reverseEdges(graphNode [] G){
      graphNode [] T = new graphNode[G.length];  
      for (int i=0;i<G.length;i++)
         for(graphNode x=G[i]; x !=null; x=x.next)
           T[x.dest] = new graphNode(i,T[x.dest]);
      for (int i=0;i<G.length;i++)
        G[i] =  T[i];
   }


   public static int outDegree(graphNode [] G, int v){
      int count=0;
      for(graphNode x=G[v]; x !=null; x=x.next)
            count++;
      return count;
   }
   
   public static graphNode [] g1(int n){
      graphNode [] G =  new graphNode[n];
      for(int i=0;i<n;i++){
         G[i] = null;
         for(int j=1;j<3;j++)
            G[i] = new graphNode((i+j)%n, G[i]);
      }
      return G;
   }
            
   //Edge List Methods  
   
   public static void printGraph(edgeNode E){
      System.out.print("G:");
      for (edgeNode t=E; t!=null; t=t.next)
         System.out.print("("+t.source+","+t.dest+","+t.cost+") ");
      System.out.println();   
   }
   
   public static void reverseEdges(edgeNode E){
      int temp;
      for (edgeNode t=E; t!=null; t=t.next){
         temp = t.source;
         t.source=t.dest;
         t.dest=temp;
      }   
   }

   public static int outDegree(edgeNode E, int v){
      int count=0;
      for (edgeNode t=E; t!=null; t=t.next)
         if(t.source==v)
            count++;
      return count;
   }

   public static edgeNode g3 (int n){
      edgeNode G =  null;
      for(int i=0;i<n;i++)
         for(int j=i+1;j<n;j++)
            G = new edgeNode(i,j,i+j,G);
      return G;
   }

       
   public static int edgeCost(edgeNode E, int i, int j ){
      for (edgeNode t=E; t!=null; t=t.next)
         if (i== t.source && j==t.dest)
            return t.cost;
      return Integer.MAX_VALUE;
   }
 
   public static void main(String[] args)   {
	   graphNode [] G1 = g1(5);
      printGraph(G1);   
      int v = 0;
      System.out.println("Out degree of "+v+" is "+outDegree(G1,v));
      System.out.println("Reversing edges:");
      reverseEdges(G1);
      printGraph(G1); 
      System.out.println();
      
      boolean [][]G2 = g2(5);
      printGraph(G2); 
      System.out.println("Out degree of "+v+" is "+outDegree(G2,v));
      System.out.println("Reversing edges:");
      reverseEdges(G2);
      printGraph(G2);       
      System.out.println();
      
      edgeNode G3 = g3(5);
      printGraph(G3);  
      System.out.println("Out degree of "+v+" is "+outDegree(G3,v));
      System.out.println("Cost of edge("+2+","+4+")="+edgeCost(G3,2,4));     
      System.out.println("Reversing edges:");
      reverseEdges(G3);
      printGraph(G3);
    
   }
}