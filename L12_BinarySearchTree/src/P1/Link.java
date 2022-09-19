package P1;

public class Link {
	private int val;
	Link left_link;
	Link right_link;
	public Link(int val) {
		this.val=val;
		left_link = null;
		right_link =null;
	}
	public Link getLeft_link() {
		return left_link;
	}
	public void setLeft_link(Link left_link) {
		this.left_link = left_link;
	}
	public Link getRight_link() {
		return right_link;
	}
	public void setRight_link(Link right_link) {
		this.right_link = right_link;
	}
	public int getVal() {
		return val;
	}
	public void evaluate(Link a) {
		if(a.getVal()<val) {
			if(left_link==null) {
				left_link = new Link(a.getVal());
				
			}
			else {
				left_link.evaluate(a);
			}
		}
		else {
			if(right_link==null) {
				right_link = new Link(a.getVal());
				
			}
			else {
				right_link.evaluate(a);
			}
			
		}
	}
	
}
