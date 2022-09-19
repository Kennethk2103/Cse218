package p1;

public class IndexMaker {
	
	public int[] Maker(int num) {
		int a[] = new int[1000];
		
		for(int i=0;i<num;i++) {
			int temp = (int)(Math.random()*1000000);
			a[i]=temp;
		}
		return a;
	}

}
