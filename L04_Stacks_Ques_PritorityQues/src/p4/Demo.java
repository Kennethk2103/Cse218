package p4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("M",1);
		Student s2 = new Student("E",3);
		Student s3 = new Student("F",7);
		Student s4 = new Student("G",10);
		Student s5 = new Student("A",2);
		
		PriorityQue pq = new PriorityQue(10);
		pq.insert(s5);
		pq.insert(s4);
		pq.insert(s3);
		pq.insert(s3);
		pq.insert(s2);
		pq.insert(s1);
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
		
	}

}
