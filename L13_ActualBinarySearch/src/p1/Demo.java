package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.insert(5, 6.0);
		tree.insert(10, 55.0);
		tree.insert(1, 10.0);
		tree.insert(2, 8.0);
		tree.insert(7, 9.0);
		tree.insert(25, 6.5);
		tree.insert(3, 9.5);
		tree.insert(4, 7.0);
		tree.minimum().displayNode();
//		System.out.println(tree.Delete(4));
		tree.find_Node(4).displayNode();
		///fix insert method
		
		
	}

}
//tree map when data is always in key values pair like username and password(username is unique/is key)/// use key, if search by value it is slow
//treeset when using object with comparable///can determine key
///have to be ojects for both
//shell sort best case nlogn worse case n^2, worse case when array is sorted in reverse order
//quicksort logn ///bad when data is sorted backwards
//merge sort logn 
// sorted array insert N Search Logn N delete N
// Linked List - insert 1, search N, delete N
//binary search tree insert logn search logn delete Logn
