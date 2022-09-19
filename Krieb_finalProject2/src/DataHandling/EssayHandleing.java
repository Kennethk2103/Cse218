package DataHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EssayHandleing {
	private static HashSet<String> table;
	
	public EssayHandleing() {
	}
	
	public HashSet<String> getTable() {
		return table;
	}
	public void setTable(HashSet<String> table) {
		EssayHandleing.table = table;
	}
	
	public static String readEssay(File file) {
		String essay="";
		Scanner scan;
		try {
			scan = new Scanner(file);
			
			while(scan.hasNextLine()) {
				essay += scan.nextLine();
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return essay;
			
	}
	
	public static  LinkedList<String> getWords(String para) {
		String pattern = "[!@.,/? ]+";
		Pattern tokenSplitter = Pattern.compile(pattern);
		List<String> list = Arrays.asList(tokenSplitter.split(para));
		LinkedList<String> words=  new LinkedList<>(list);

		return words;
	}

	public static double getFletchScore(String para) {
		LinkedList<String> words = getWords(para);
	
		double ASL = words.size()/countSentences(para);////average sentence length
		double ASW =totalSyllabels(words)/words.size();///average syllabels per word
		double fletch = (206.835-(1.015*ASL) - (84.6*ASW));
		return fletch;
	}
	
	public static double countSyllables(String word) {
		double nums = 0;
		String pattern = "[AEIOUYaeiouy]+";
		Pattern tokenSplitter = Pattern.compile(pattern);
		Matcher m = tokenSplitter.matcher(word);

		String lastToken = "";
		while (m.find()) {
			nums++;
			lastToken = m.group();
		}
		if (lastToken.equals("e") && nums > 1 && word.charAt(word.length() - 1) == 'e') {
			nums--;
		}
		return nums;
	}
	public static double totalSyllabels(LinkedList<String> words) {
		double nums=0;
		for(int i =0 ;i<words.size();i++) {
			nums=nums+ countSyllables(words.get(i));
		}
		return nums;
	}

	public static double countSentences(String str) {
		double nums = 0;
		String pattern = "[^.?!]+";
		Pattern tokenSplitter = Pattern.compile(pattern);
		Matcher m = tokenSplitter.matcher(str);
		while (m.find()) {
			nums++;
		}
		return nums;
	}
	public static double getTypos(String para,DataManager data) {
		LinkedList<String> words = getWords(para);
		int nums=0;
		for(int i=0;i<words.size();i++) {
			if((data.getEssayHandle().getTable().contains(words.get(i).toLowerCase()))==false ) {
				nums++;
			}
		}
		return ((double)nums/(words.size()/100));
	}
	
	public static String getSummary(File file) {
		String summary="";
		Scanner scan;
		try {
			scan = new Scanner(file);
			while(scan.hasNextLine()) {
				summary += scan.nextLine() + "\n";
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return summary;
	}
}
