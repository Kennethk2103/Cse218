package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sorts a = new Sorts(10);
		a.insert(1);
		a.insert(3);
		a.insert(2);
		a.insert(8);
		a.insert(9);
		a.insert(5);
		a.insertionSort();
		a.display();
 	}

}
