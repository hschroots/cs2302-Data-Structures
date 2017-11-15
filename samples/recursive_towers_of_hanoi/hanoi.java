public class hanoi{  

   public static void hanoi(int disks, char source, char spare, char dest){
      if(disks>1){
         hanoi(disks-1, source, dest, spare);
         hanoi(1, source, spare, dest);
         hanoi(disks-1, spare, source, dest);
      }
      else
         System.out.println("Move disk from " +source+ " to "+dest );
   }

   public static void main(String[] args)   {
      hanoi(3,'A','B','C');
   }  
}     
