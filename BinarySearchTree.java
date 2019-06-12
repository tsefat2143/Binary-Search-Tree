import java.util.Queue;
import java.util.ArrayDeque;

public class BinarySearchTree implements Map {   
    Node root; 
        
    public Node put(int k, Node root) { 
          if (root == null) { 		//no key then add the node
            root = new Node(k); 
            return root; 
        } 
        if (k < root.k) 			//add to the left 
            root.left = put(k, root.left); 
        else if (k > root.k) 		//add to the right
            root.right = put(k, root.right); 
  
        return root; 
    }
	
	public Node remove(int k, Node root) { 
        if (root == null) {			//if empty return the root
			System.out.println("Tree is empty");
			System.out.println();
			return root;
		}     
        if (k < root.k) 			//remove left
            root.left = remove(k, root.left); 
        else if (k > root.k) 		//remove right
            root.right = remove(k, root.right); 
   
        else { 		// if key is same as root's key 
			// node has 1 or no child
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left;
			//2 subtrees
			Node temp = root.right;
			while(temp.left != null)
				temp = temp.left;
				root.k = temp.k;
				root.right = remove(root.k, root.right);
        } 
        return root; 
    }
	
	public void put(int k) { 
       root = put(k, root); 
    }
	
	public void remove(int k) {
        root = remove(k, root);
    }    
   
    public void inOrder(Node root) {
        if (root != null) { 
            inOrder(root.left); 
            System.out.print(root.k + " "); 
            inOrder(root.right); 
        } 
    }
	
	public void inOrder()  { 
       inOrder(root); 
    }
	
	public void preOrder(Node root) {
		if (root != null){
			System.out.print(root.k + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void preOrder(){
		preOrder(root);
	}
	
	public void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.k + " ");
		}
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	public void levelOrder(Node root) {
      	Queue<Node> queue = new ArrayDeque<>();
      	if (root != null)
		queue.add(root);
      	while (!queue.isEmpty()) {
		Node n = queue.remove();
         	System.out.print(n.k + " ");
         	if (n.left != null) queue.add(n.left);
         	if (n.right != null) queue.add(n.right);
      }
   }
   
   public void levelOrder(){
	   levelOrder(root);
   }
   
	public Node get(int k) {
		if (root == null)
			System.out.println("ADD NODES");
		
		Node search = null;
		if (root != null) {
			search = root;
			while (search.k != k) {
            //left
            if (k < search.k) {
                search = search.left;
            }
			else {
                //right 
                search = search.right;
            }
            //node not found
            if (search == null)
                return null;
			}
		}
		return search;
	}
}
