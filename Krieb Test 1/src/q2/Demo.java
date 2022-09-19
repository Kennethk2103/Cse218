package q2;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class Demo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [][] array=Maker();
			int [][] randomNumsToSearch = randomDataToSearch(array);
			int nElms=50;
			long [] timesForSeq= new long[10];
			long [] timesForBin= new long[10];
			for(int i =0; i<10;i++) {
				long temp1=0;
				long temp2=0;
				
				int tempArray[]=new int[nElms];
				for(int b =0;b<nElms;b++) {
					tempArray[i]=array[b][i];
				}
				Arrays.sort(tempArray);
				for(int j=0;j<10;j++) {
					temp1 = temp1 + sequentialSearch(array,randomNumsToSearch[j][i],nElms,i);
					temp2 = temp2 + binarySearch(tempArray,randomNumsToSearch[j][i],nElms,i);
				}
				nElms=nElms+100;

				timesForSeq[i]=(temp1/10);
				timesForBin[i]=(temp2/10);

				
			}
			Print(timesForSeq,timesForBin);

		
	}
	public static int[][] Maker() {
		int a[][] = new int[1000][10];
		///i is nums b is array num
		for(int b=0;b<10;b++) {
			for(int i=50;i<1001;i=i+100) {

				a[i][b]=(int)(Math.random()*1000000);
			}
		}
		return a;
	}
	public static int[][] randomDataToSearch(int[][] array) {
		int [][] temp = new int[10][10];
		int num = 50;
		for(int a =0;a<10;a++){
			for(int b=0;b<10;b++) {
				temp[a][b]=array[(int)(Math.random()*(num+1))][a];
			}
			num=num+100;
		}
		return temp;
	}
	
	
	public static long sequentialSearch(int a[][],int num,int nElms,int c) {
		long start = System.nanoTime();
		for(int i=0;i<nElms;i++) {
			if(a[i][c]==num) {
				return System.nanoTime()-start;
			}
		}

		return System.nanoTime()-start;
		
	}
	public static long binarySearch(int a[],int num,int nElms, int c) {
		int first=0;
		long start = System.nanoTime();

		int last=nElms-1;
		while(last>=first) {
			int mid =(first+last)/2;
			if(a[mid]==num) {
				return System.nanoTime()-start;
			}
			else if(a[mid]>num) {
				last=mid-1;
			}
			else {
				first=mid+1;
			}
		}
		return System.nanoTime()-start;
		
		
	}
	public static void Print(long[] timesForSeq, long[] timesForBin) {
		File firstNameFile = new File("Times.txt");
		try {
			int nElms=50;
			PrintWriter pw = new PrintWriter("Times");
			pw.println("Sequential Search");
			for(int i =0;i<10;i++) {
				pw.println(timesForSeq[i]+" | " + "number of elms " + nElms);
				nElms=nElms+100;
			}
			pw.println("Binary Search");
			nElms = 50;
			for(int i =0;i<10;i++) {
				pw.println(timesForBin[i]+" | " + "numebr of elms " + nElms);
				nElms=nElms+100;
			}
			pw.close();
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
