package Double_Ended_List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstLastList list = new FirstLastList();
	
		list.insertLast(1.0);
		list.insertLast(2.2);
		list.insertLast(3.3);
		list.insertLast(4.4);
		list.insertLast(5.5);
		list.insertLast(6.6);
		
		while(!list.isEmpty()) {
			System.out.println(list.deleteFirst());
		}

		

	}

}
