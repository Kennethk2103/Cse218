package p6;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class BagGen <E> {
	private ArrayList<E> list;
//	public BagGen(int maxSize) {
//		arr =(E[])new Object[maxSize];
//	}
	public BagGen() {
		list = new ArrayList<>();
	}
	public void insert(E val) {
		list.add(val);
	}
	public void display() {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

	}
	public ArrayList<E> searchByLastName(E lName) {
		ArrayList<E> temp = new ArrayList<>();
		for(int i =0;i<list.size();i++) {
			if(list.get(i).equals(lName)) {
				temp.add(list.get(i));
			}
		}
		return temp;
	}
	public ArrayList<E> searchByLastName(Predicate predicate) {
		ArrayList<E> temp = new ArrayList<>();
		for(int i =0;i<list.size();i++) {
			if(predicate.test(list.get(i))) {
				temp.add(list.get(i));
			}
		}
		return temp;
	}
}
