public class Node {
	int k; 
    Node left, right; 
  
    public Node(int k) {
		this.k = k; 
        this.left = null;
		this.right = null; 
	}
	
	//get int value of Node
	//got toString method from https://www.youtube.com/watch?v=M6lYob8STMI
	public String toString(){
		return k + " ";
	}
}