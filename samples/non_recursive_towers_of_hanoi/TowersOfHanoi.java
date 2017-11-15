/* Towers of Hanopi using a stack instead of recursion */
/* Programmed by Olac Fuentes, September 28, 2016      */  
import java.util.*;
public class TowersOfHanoi{	
	
    public static void towers(int n, char source, char spare, char dest){
       Stack<HanoiRecord> callStack=new Stack();
   
       HanoiRecord m;
       callStack.push(new HanoiRecord(n, source, spare, dest));
   
       while (!callStack.empty()){   
            m=callStack.pop();
            if (m.n==1)
               System.out.println("Move top disk from "+m.source+" to "+m.dest);
            else{
               callStack.push(new HanoiRecord(m.n-1,m.spare,m.source,m.dest));
               callStack.push(new HanoiRecord(1,m.source,m.spare,m.dest));
               callStack.push(new HanoiRecord(m.n-1,m.source,m.dest,m.spare));
            }
         }  
   }
   
   public static void main(String[] args) {
	   towers(3,'A','B','C');
   }
}
