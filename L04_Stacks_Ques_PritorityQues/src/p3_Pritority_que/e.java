package p3_Pritority_que;

public class e {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
//		int nElms=7;
//
//		System.out.println(nElms-1);
//		System.out.println(nElms);
//		System.out.println(--nElms);
//		System.out.println(nElms);
//		System.out.println(nElms--);
		PriorityQue pq = new PriorityQue(10);
		pq.insert(1);
		pq.insert(3);
		pq.insert(2);
		pq.insert(20);
		pq.insert(18);
		pq.insert(5);
		pq.insert(8);
		pq.insert(6);
		while(!pq.isEmpty()) {
		System.out.println(pq.remove());///takes out smallest num	
		}

	}

}
