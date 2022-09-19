package DataHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {

	public static void backUpApplicantData(ApplicantHandleing app) {
		
		FileOutputStream fos;
		ObjectOutputStream oos;

		try {
			fos = new FileOutputStream("BackupData/applicantDataBase.dat");	
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(app);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ApplicantHandleing restoreApplicantData() {
		ApplicantHandleing app = new ApplicantHandleing();
		File file = new File("BackupData/applicantDataBase.dat");
		if(!file.exists()) {
			return app;
		}
		else {
			FileInputStream fis;
			try {
				fis = new FileInputStream("BackupData/applicantDataBase.dat");
				ObjectInputStream ois=new ObjectInputStream(fis);
				app = (ApplicantHandleing) ois.readObject();
				

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return app;
	}
	
public static void backUpDictionary(HashSet<String> table) {
		
		FileOutputStream fos;
		ObjectOutputStream oos;

		try {
			fos = new FileOutputStream("BackupData/dictionaryDataBase.dat");	
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(table);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static HashSet<String> restoreDictionaryData() {
		HashSet<String> table = null;
		File file = new File("BackupData/dictionaryDataBase.dat");
		if(!file.exists()) {
			String dictionary="";
			File wordsFile = new File("dictionary.txt");///handlle making new dictionary
			Scanner scan;
			try {
				scan = new Scanner(wordsFile);
				while(scan.hasNextLine()) {
					dictionary += scan.nextLine() + " ";
				}
				String [] words =dictionary.split(" ");/////Replace soon
				table = new HashSet<String>((int)(words.length*1.25));
				for(int i =0;i<words.length;i++) {
					table.add(words[i]);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			FileInputStream fis;
			try {
				fis = new FileInputStream("BackupData/dictionaryDataBase.dat");
				ObjectInputStream ois=new ObjectInputStream(fis);
				table = (HashSet<String>) ois.readObject();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return table;
	}
	public static LinkedList<String> statesList() {////get LinkedList
		LinkedList<String> list = new LinkedList<>();
		File file = new File("states.txt");

		Scanner scan;
		try {
			scan = new Scanner(file);
			int i =0;
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				list.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
			
		
	}

	public static PriorityQueue<Applicant> restoreQue() {
		PriorityQueue<Applicant> que = new PriorityQueue<Applicant>();
		File file = new File("BackupData/queDataBase.dat");
		if(!file.exists()) {
			return que;
		}
		else {
			FileInputStream fis;
			try {
				fis = new FileInputStream("BackupData/queDataBase.dat");
				ObjectInputStream ois=new ObjectInputStream(fis);
				que = (PriorityQueue<Applicant>) ois.readObject();
				ois.close();
				

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return que;
	}
public static void backUpQueData(PriorityQueue<Applicant> que) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("BackupData/queDataBase.dat");	
			oos = new ObjectOutputStream(fos);
			oos.writeObject(que);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
