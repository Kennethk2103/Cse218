package DoublyLinked_list;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFirst(22);
		list.insertFirst(122);
		list.insertFirst(322);
		list.displayFoward();
		
		list.insertAfter(122, 80);
		list.insertBefore(22, 8);
		list.displayFoward();
		
		list.deleteKey(8);
		list.displayFoward();
		
	}

}
