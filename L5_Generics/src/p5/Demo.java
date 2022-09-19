package p5;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BagGen<Name> bag= new BagGen<>(Name.class,10);
		bag.insert(new Name("a","B"));
		bag.insert(new Name("Z","T"));
		bag.insert(new Name("I","A"));
		Name name = new Name("Z","T");
		bag.insert(name);
//		Name[]a = bag.searchByLastName(name);
		Name[]a = bag.searchByLastName(Name.class, new Name("Z","T"));
		
		System.out.println(Arrays.toString(a));
		
	}

}
