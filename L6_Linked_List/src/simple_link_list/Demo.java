package simple_link_list;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList list = new LinkList();
	
		list.insertFirst(1, 1.0);
		list.insertFirst(2, 2.2);
		
		list.insertFirst(3, 3.3);
		list.insertFirst(4, 4.4);
		
		list.displayList();
		System.out.println("");

		list.find(3).displayLink();
		System.out.println("");

		list.delete(2).displayLink();
		System.out.println("");
		list.displayList();
		
		

	}

}
