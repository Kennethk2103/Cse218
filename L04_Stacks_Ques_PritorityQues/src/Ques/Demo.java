package Ques;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue myQue = new Queue(5);
		myQue.add(10);
		myQue.add(11);
		myQue.add(12);
		myQue.add(13);
		myQue.add(14);

		System.out.println(myQue.remove());
		System.out.println(myQue.remove());
		myQue.add(15);
		myQue.add(16);
		
		while(!myQue.isEmpty()) {
			System.out.println(myQue.remove());
		}
	}

}
