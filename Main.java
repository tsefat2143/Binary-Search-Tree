public class Main{
	public static void main(String[] args) { 
        BinarySearchTree bst = new BinarySearchTree(); 
        bst.put(10); 
        bst.put(6); 
        bst.put(4); 
        bst.put(8); 
        bst.put(18); 
        bst.put(15); 
        bst.put(21); 
		
		System.out.println("Before");
		System.out.print("LEVEL ORDER: ");
		bst.levelOrder();
		System.out.println();
		System.out.println();		
		
		System.out.print("IN ORDER: ");
        bst.inOrder(); 
		System.out.println();
		System.out.println();

		
		System.out.print("PRE ORDER: ");
        bst.preOrder(); 
		System.out.println();
		System.out.println();

		System.out.print("POST ORDER: ");
        bst.postOrder(); 
		System.out.println();
		System.out.println();
		
		System.out.println(bst.get(30));	//return snull since 30 is not in the tree
		System.out.println();
        System.out.println(bst.get(15));	//returns 15
		System.out.println();

		
		bst.remove(10);
		bst.remove(4);
		bst.remove(15);
		
		System.out.println("After");
		System.out.print("LEVEL ORDER: ");
		bst.levelOrder();
		System.out.println();
		System.out.println();		

		
		System.out.print("IN ORDER: ");
        bst.inOrder(); 
		System.out.println();
		System.out.println();

		
		System.out.print("PRE ORDER: ");
        bst.preOrder(); 
		System.out.println();
		System.out.println();

		System.out.print("POST ORDER: ");
        bst.postOrder(); 
		System.out.println();

    }
}
