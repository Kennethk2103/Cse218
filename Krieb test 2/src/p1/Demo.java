package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQue que = new PriorityQue(10);
		que.insert(new Student("S",3.3,"cse"));
		que.insert(new Student("T",4.4,"MAT"));
		que.insert(new Student("U",5.0,"ENG"));
		que.insert(new Student("G",5.0,"SPA"));
		que.insert(new Student("F",1.0,"ART"));
		que.display();
		System.out.println("");
		System.out.println(que.pop());
		System.out.println("");
		que.display();
		
	}

}
