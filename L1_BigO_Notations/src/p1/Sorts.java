package p1;

public class Sorts {
	private int[] a;
	private int nElms;///number of data items
	public Sorts(int max) {
		a = new int[max];
		nElms=0;
		
	}
	public void bubbleSort() {
		int out;
		int in;
		for(out=nElms-1; out>=1;out--) {
			for(in =0; in < out;in++) {///two nested for loops
				if(a[in]>a[in+1]) {
					Swap(in, in+1);
				}
			}
		}
	}
	public void selectionSort() {
		int out;
		int in;
		int min;
		for(out =0; out<nElms-1;out++) {
			min =out;
			for(in =out+1;in<nElms;in++) {
				if(a[in]<a[min]) {
					min=in;
				}
			}
			Swap(out,min);
		}
	}
	public void insertionSort() {
		int in;
		int out;
		for(out =1; out<nElms;out++) {
			int temp=a[out];
			in = out;
			while(in>0 && a[in-1]>=temp) {
				a[in] = a[in-1];
				in--;
			}
			a[in]=temp;
		}
	}
	
	public void Swap(int one,int two) {
		int temp = a[one];
		a[one]=a[two];
		a[two]=temp;
	}
	public void insert(int value) {
		a[nElms++]=value;
	}
	public void display() {
		for(int i =0; i< nElms;i++) {
			System.out.println(a[i]);
		}
	}

}
