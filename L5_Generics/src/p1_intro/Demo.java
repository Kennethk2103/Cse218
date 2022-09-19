package p1_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name name1 = new Name("A","AA");
		Name name2 = new Name("Z","M");
		Name name3 = new Name("E","At");
		
		Name [] arr = {name1,name2,name3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		ArrayList<Name> List = new ArrayList<>();
		List.add(name1);
		List.add(name2);
		List.add(name3);
		Collections.sort(List);
		System.out.println(List);
	
		
		ArrayList<String> List2 = new ArrayList<>();
		List2.add("M");
		List2.add("Z");
		List2.add("C");
		
		Collections.sort(List2 ,(s1,s2)->{
			return -s1.compareTo(s2);
		});
		System.out.println(List2);
		ArrayList list = new ArrayList();
		list.add(name3);
		list.add(3);
		list.add(4.0);
		list.add("3");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
	}

}
