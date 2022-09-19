package p2;

import java.util.Arrays;

public class StudentBag {
	private Student [] a;
	private int nElms;
	private static String[] nameList=new String[1000];
	private static int count=0;
	public StudentBag(int maxSize) {
		a= new Student[maxSize];
		nElms=0;
	}
	public void insert(Student s) {
		a[nElms++]=s;
	}
	public void fill(int num) {
		long startTime = System.nanoTime();
		for(int i=0;i<num;i++) {
			String name = getName();
			Student temp = new Student(name,getGpa(),getAge());
			nameList[count++]=name;
			a[nElms++]=temp;
	}
	System.out.println((System.nanoTime()-startTime));	
	}
	public String getName() {
		String name="";
		for(int d=0;d<5;d++) {
			char randomChar = (char)((int)(Math.random()*26+97));
			name+=randomChar;
		}
		return name;
	}
	public double getGpa() {
		return (Math.random()*4001)/1000;
	}
	public int getAge() {
		return (int)(Math.random()*23+18);

	}
	public void display() {
		for(int i =0;i<nElms;i++) {
			System.out.println(a[i]);
		}
	}
	public void reset() {
		nElms=0;
	}
//	public static String[] get20Names() {
//		int n =0;
//		String [] temp = new String[20];
//		for(int i =0; i<20;i++) {
//			int random = (int)(Math.random()*count);
//			temp[n++]=nameList[random];
//		}
//		return temp;
//	}
	public long sequentialSearch(String name) {
		long startTime = System.nanoTime();
		for(int i =0;i<nElms;i++) {
			if(a[i].getName().equals(name)) {
				return (System.nanoTime()-startTime);
			}
		}
		return 0;
	}
	public long sequentalSearchTotalTime() {
		long total=0;
		for(int i =0;i<20;i++) {
			total+=sequentialSearch(a[(int)(nElms*Math.random())].getName());
		}
		return (total/20);
	}
	public Student[] sort() {
		Student[] temp=Arrays.copyOf(a, nElms);
		Arrays.sort(temp);
		return temp;
	}
	public long binary() {
		Student[] dataArr= sort();
		long total=0;
		for(int i =0;i<20;i++) {
			total+=binarySearch((int)(Math.random()*nElms),dataArr);;
		}
		return (total/20);
		
		
	}
	public long binarySearch(int value,Student[] data) {
		long start = System.nanoTime();
		String Name = data[value].getName();
		int low =0;
		int high = nElms-1;
		while(high>=low) {
			int mid = (low+high)/2;
			if(data[mid].getName().equals(Name)) {
				System.out.println("Found");
				return mid;
			}
			else if (data[mid].getName().compareTo(Name)>0){
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return System.nanoTime()-start;
	}
	public void bubbleSort() {
		int out;
		int in;
		for(out=nElms-1; out>=1;out--) {
			for(in =0; in < out;in++) {///two nested for loops
				if(a[in].getName().compareTo(a[in++].getName())>0) {
					String temp = a[in++].getName();
					a[in++].setName(a[in].getName());
					a[in].setName(temp);
					
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
				if(a[in].getName().compareTo(a[min].getName())>0) {
					min=in;
				}
			}
			
			String temp = a[out].getName();
			a[out].setName(a[in].getName());
			a[in].setName(temp);
		}
	}
	public void insertionSort() {
		String [] tempArray= new String[nElms];
		int in;
		int out;
		for(out =1; out<nElms;out++) {
			String temp=a[out].getName();
			in = out;
			while(in>0 && a[in-1].getName().compareTo(temp)>0) {
				a[in] = a[in-1];
				in--;
			}
			tempArray[in]=temp;
		}
	}
	
}

///search by name
