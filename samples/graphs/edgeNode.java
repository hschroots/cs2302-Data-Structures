public class edgeNode{
   int  source;
   int  dest;
   int cost; //Set to 1 if graph is unweighted
   edgeNode next;

   public edgeNode(int source, int dest, int cost, edgeNode next){
      this.source = source;
      this.dest = dest;
      this.cost = cost;
      this.next = next;
   }

    public edgeNode(int source, int dest, edgeNode next){
      this.source = source;
      this.dest = dest;
      this.cost = 1;
      this.next = next;
   }

}