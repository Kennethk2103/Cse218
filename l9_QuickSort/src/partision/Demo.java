package partision;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partition arr= new partition(10);
		arr.insert(1);
		arr.insert(3);
		arr.insert(2);
		arr.insert(9);
		arr.insert(5);
		arr.insert(8);
		arr.insert(4);
		arr.insert(10);
		int part = arr.partIt(0, arr.size()-1, 5);
		System.out.println(part);
		arr.display();
	}

}
