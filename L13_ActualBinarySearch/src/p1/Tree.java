package p1;


public class Tree {
	private Node root;

	public Tree() {
		super();
		root=null;
	}
	public void insert(int iData,double dData) {
		Node temp = new Node();
		temp.dData=dData;
		temp.iData=iData;
		if(root == null) {
			root=temp;
		}
		else {
			Node current = root;
			Node parent;
			while(true) {
				parent=current;
				if(iData>current.iData) {
					current=current.right_Node;
					if(current==null) {
						parent.right_Node=temp;///current
						return;
					}
				}
				else {
					current=current.left_Node;
					if(current==null) {
						parent.left_Node=temp;
						return;
					}
				}
				
				
			}
		}
		
	}
	public boolean Delete(int key) {
		Node current;
		current = root;
		Node parent = root;
		boolean isLeftChild=true;
		
		while(current.iData!=key) {
			parent=current;
			if(key<current.iData) {
				isLeftChild=true;
				current=current.left_Node;
				
			}
			else {
				isLeftChild=false;
				current=current.right_Node;
			}
			if(current==null) {
				return false;
			}
		}///end of while loop
		///curent is node to be deleted
		///case 1 current node has not children
		if(current.left_Node==current.right_Node && current.right_Node ==null) { /// or left = null and right == null
			if(current==root) {
				root=null;//tree is empty
			}
			else if(isLeftChild) {
				parent.left_Node=null;
			}
			else {
				parent.right_Node=null;
			}
		}
		///case 2 current has no right child, replace with left subtree
		else if(current.right_Node==null ) {///no right child must have left
			if(current == root) {
				root = current.left_Node;
			}
			else if(isLeftChild) {
				parent.left_Node=current.left_Node;
			}
			else {
				parent.right_Node=current.left_Node;
			}
			
		}
		
		else if(current.left_Node==null) {///no left child right child exists
			if(current==root) {
				root=current.right_Node;
				
			}
			else if(isLeftChild) {
				parent.left_Node=current.right_Node;
				
			}
			else {
				parent.right_Node=current.right_Node;
			}
			
		}
		else {///current has 2 children
			//get succesor min on right side 
			Node succesor = getSuccesor(current);
			if(current==root) {
				root=succesor;
			}
			else if(isLeftChild) {
				parent.left_Node=succesor;
			}
			else {
				parent.right_Node=succesor;
			}
			succesor.left_Node=current.left_Node;
		}
		return true;
		///finding node logn
		///finding succesor logn
	}
	
		private Node getSuccesor(Node deleteNode) {
		// TODO Auto-generated method stub
		Node succesorParent = deleteNode;
		Node succesor = deleteNode;
		Node current = deleteNode.right_Node;
		while(current!=null) {
			succesorParent=succesor;
			succesor=current;
			current=current.left_Node;
		}
		if(succesor!=deleteNode.right_Node) {///if succesor is not right child
			succesorParent.left_Node=succesor.right_Node;
			succesor.right_Node=deleteNode.right_Node;
		}
		return succesor;
		
	}
		public Node minimum() {
			Node current;
			Node last =null;
			current=root;
			while(current!=null) {
				last = current;
				current=current.left_Node;
				
			}
			return last;
		}
		public Node max() {
			Node current;
			Node last =null;
			current=root;
			while(current!=null) {
				last = current;
				current=current.right_Node;
				
			}
			return last;
		}
	
	
	
	public Node find_Node(int key) {
		Node current=root;
		
		while(current.iData!=key) {
			if(key<current.iData) {
				current=current.left_Node;
			}
			else {
				current=current.right_Node;
			}
			if(current==null) {
				return null;
				///return null
			}
		}
		return current;
	
	}
	

}
