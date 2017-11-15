import java.util.Random; 
public class BTreeTest{
 
  public static void printAscending(BTreeNode T){
   //Prints all keys in the tree in ascending order
		if (T.isLeaf){
			for(int i =0; i<T.n;i++)
				System.out.print(T.key[i]+" ");
		}
		else{
			for(int i =0; i<T.n;i++){
				printAscending(T.c[i]);
				System.out.print(T.key[i]+" ");
			}
			printAscending(T.c[T.n]);

		}
   }

   public static void main(String[] args)   {
	   int [] S ={6, 3, 16, 11, 7, 17, 14, 8, 5, 19, 15, 1, 2, 4, 18, 13, 9, 20, 10, 12, 21};

		BTree B = new BTree(3);
      for (int i=0;i<S.length;i++){
  			B.insert(S[i]);
		   B.printNodes();
         System.out.println("*********************");
      }
      BTreeNode T = B.root;
      printAscending(T);
      
      //Build B-tree with random elements
      Random rn = new Random();
      BTree R = new BTree(4);
      for (int i=0;i<30;i++){
  			R.insert(rn.nextInt(100));
		   R.printNodes();
         System.out.println("*********************");
      }
      T = R.root;
      printAscending(T);

      
	}
}