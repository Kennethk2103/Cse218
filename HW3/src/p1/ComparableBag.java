package p1;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ComparableBag < T extends Comparable>{
	private ArrayList<T> List;
	private int nElms;
	public ComparableBag() {
		List = new ArrayList<>();
	}
	public void add(T val) {
		List.add(val);
		nElms++;
	}
//	public T remove() {
//		return List.remove(nElms--);
//				
//	}
	public ArrayList<T> remove(Predicate predicate) {
		ArrayList<T> temp = new ArrayList<>();
		for(int i=0; i<List.size();i++) {
			if(predicate.test(List.get(i))) {
				temp.add(List.remove(i));
				nElms--;
			}
		}
		return temp;
	}
	public void display(Predicate<T> predicate) {
		for(int i=0; i<List.size();i++) {
			if(predicate.test(List.get(i))) {
				System.out.println(List.get(i));
			}
		}
		
	}
	public ArrayList<T> search(Predicate<T> predicate) {
		ArrayList<T> temp = new ArrayList<>();
		for(int i=0; i<List.size();i++) {
			if(predicate.test(List.get(i))) {
				temp.add(List.get(i));
			}
		}
		return temp;
		
	}
	

}
