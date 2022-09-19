package p1_merge;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortArray array = new MergeSortArray(10);
		array.insert(1);
		array.insert(3);
		array.insert(2);
		array.insert(10);
		array.insert(7);
		array.insert(4);
		array.insert(11);
		array.mergeSort();
		array.display();
	}

}
