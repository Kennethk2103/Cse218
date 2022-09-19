package p5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("bob",4.0);
		Student s2 = new Student("sbeve",2.0);
		Student s3 = new Student("e",3.0);
		PriorityQue que = new PriorityQue();
		que.add(s3);
		que.add(s2);
		que.add(s1);
		while(!que.isEmpty()) {
			System.out.println(que.remove());
		}
		que.add(s3);
		que.add(s2);
		que.add(s1);
		
		Arrays.sort(que.returnArray());
	}

}
