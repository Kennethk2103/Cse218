package P1;

public class Binary_search_tree {
	Link parent_Link;

	public Binary_search_tree() {
		parent_Link=null;
	
	}
	public void addLink(Link a) {
		if(parent_Link==null) {
			parent_Link=a;
		}
		else {
			parent_Link.evaluate(a);
		}
	}
	
	public Link find_Link(Link a) {
		Link current_Link=parent_Link;
		while(current_Link.getVal()!=a.getVal() &&(current_Link.left_link==null &&current_Link.right_link==null)) {
			if(a.getVal()==current_Link.getVal()) {
				return current_Link;
			}
			if(current_Link.getVal()<a.getVal()) {
				current_Link=current_Link.getLeft_link();
			}
			if(current_Link.getVal()>a.getVal()) {
				current_Link=current_Link.getRight_link();
			}
			
			
		}
		System.out.println("Link dosent exist");
		return null;
	}
	public void delete_Link(Link a) {
		Link current_Link=parent_Link;
		while(current_Link.getVal()!=a.getVal() &&(current_Link.left_link==null &&current_Link.right_link==null)) {
			if(current_Link.getLeft_link().getVal()==a.getVal()) {
				current_Link.setLeft_link(null);
				break;
			}
			if(current_Link.getRight_link().getVal()==a.getVal()) {
				current_Link.setRight_link(null);
				break;
			}
			
			if(current_Link.getVal()<a.getVal()) {
				current_Link=current_Link.getLeft_link();
			}
			if(current_Link.getVal()>a.getVal()) {
				current_Link=current_Link.getRight_link();
			}
			
			
		}
		System.out.println("Link dosent exist");
	}
	
	
	
//	sorrted array searching logn insertion N deletion N
//	linked list N 1 N 
//	BST logn logn logn
//	
	
	
}

