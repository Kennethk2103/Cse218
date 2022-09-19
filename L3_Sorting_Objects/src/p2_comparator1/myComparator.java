package p2_comparator1;

import java.util.Comparator;

public class myComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
//		return o1.getName().compareTo(o2.getName());
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
