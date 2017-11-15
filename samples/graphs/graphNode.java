public class graphNode{
   int  dest;
   int cost; //Set to 1 if graph is unweighted
   graphNode next;
    
   public graphNode(int dest, int cost, graphNode next){
      this.dest = dest;
      this.cost = cost;      
      this.next = next;
   }

   public graphNode(int dest,  graphNode next){
      this.dest = dest;
      this.cost = 1;        
      this.next = next;
   }
}   