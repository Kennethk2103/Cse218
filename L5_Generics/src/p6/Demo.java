package p6;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BagGen<Name> bag= new BagGen<>();
		bag.insert(new Name("a","B"));
		bag.insert(new Name("Z","T"));
		bag.insert(new Name("I","A"));
		bag.display();
//		Name[]a = bag.searchByLastName(name);
		ArrayList<Name> a = bag.searchByLastName(s -> s.equals(new Name("Z","Z")) );
		ArrayList<Name> b = bag.searchByLastName(s -> (((Name) s).getLast().equals("B")));
		
		System.out.println(a);
		
	}

}
////lowebound that class uo such as interger can ascept number and object but not double
///upperbound class down example number can use int and double but not object