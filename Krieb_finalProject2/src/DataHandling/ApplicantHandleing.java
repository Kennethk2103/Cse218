package DataHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.scene.control.Label;

public class ApplicantHandleing implements Serializable{
	TreeMap<String, Applicant> tree ;
	private static int idNum;
	public ApplicantHandleing() {
		tree = new TreeMap<>();
		idNum=0;
	}
	
	public Applicant findApplicant(String email) {
		return tree.get(email);

	}
	public static boolean passwordSatisfactory(String password) {
		if(password.length()<7) {
			return false;
		}
		String [] expres = new String[3];
		expres[0] = "[A-Z]";
		expres[1] = "[a-z]";
		expres[2]= "[0-9]";
		
		for(int i =0;i<expres.length;i++) {
			Pattern pattern = Pattern.compile(expres[i]);
			Matcher m = pattern.matcher(password);
			if(m.find()==false) {
				return false;
			}
		}
		return true;		
	}
	
	
	public void addApplicant(Applicant a) {
		a.setId(idNum++);
		tree.put(a.getEmail(), a);
	}

	public void insertTree(TreeMap<String, Applicant> tree) {
		this.tree=tree;
	}
	public TreeMap<String, Applicant> getTree(){
		return tree;
	}
	public static boolean personInfoCompleted(Applicant applicant) {
		if(applicant.getLast_Name()==null || applicant.getLast_Name().equals("")|| applicant.getFirst_Name()==null|| applicant.getFirst_Name().equals("") 
				|| applicant.getAddress().equals(null) || applicant.getAddress().equals("")
				|| applicant.getState()==null || applicant.getIncome()==-1 || applicant.getPhoneNum().equals("") ||
				applicant.getPhoneNum()==null) {
			return false;
		}
		return true;
	}
	public static boolean schoolInfoCompleted(Applicant applicant) {
		if(applicant.getGpa()==-1 || applicant.getSat()==-1 || applicant.getEssay()==null || EssayHandleing.getWords(applicant.getEssay()).size()<250) {
			return false;
		}
		
		return true;
	}
	
	
	public static File applicantOutputHandleing(Applicant applicant, DataManager dataMan) {
		String output ="";
		DecimalFormat df = new DecimalFormat("#.##");
		String strFormat;
		if(applicant.getGpa()>=3.5 && applicant.getSat()>=1200 && dataMan.getEssayHandle().getFletchScore(applicant.getEssay())<=60
				&& dataMan.getEssayHandle().getTypos(applicant.getEssay(), dataMan)<=3 && applicant.getIncome()>=100000) {
			strFormat = "|%1$-15s|%2$-25s|\n";

			output+=String.format("|%1$-15s|%2$-25s|\n","Current Status", "Ascepted");
			output+="Accepted: GPA >= 3.5, essay readability, which is determined by a Fletch Score, is lower\r\n"
					+ "than 60, typos per 100 words in the essay is fewer than 3, family income >= $100,000,\r\n"
					+ "SAT score >= 1200. \n";
			output+=String.format(strFormat,"Catagory " , "Details " );
			output+=String.format(strFormat, "Gpa", applicant.getGpa());
			output+=String.format(strFormat, "Sat", applicant.getSat());
			output+= String.format(strFormat, "Income", df.format(applicant.getIncome()));
			output+=String.format(strFormat, "Fletch score", df.format(EssayHandleing.getFletchScore(applicant.getEssay())));
			output+=String.format(strFormat, "Typos",df.format(dataMan.getEssayHandle().getTypos(applicant.getEssay(), dataMan)));
			
		}
		else if(applicant.getGpa()<=2.5 && applicant.getSat()<=800 && EssayHandleing.getFletchScore(applicant.getEssay())>=70
				&& dataMan.getEssayHandle().getTypos(applicant.getEssay(), dataMan)>=10 && applicant.getIncome()<=10000) {
			strFormat = "|%1$-15s|%2$-25s|\n";
			output+=String.format("|%1$-15s|%2$-25s|\n","Current Status", "Rejected");
			output+="Denied: GPA < 2.5, essay readability, which is determined by Fletch Score, is higher than\r\n"
					+ "70, typos per 100 words in the essay is more than 10, family income < $10,000, SAT\r\n"
					+ "score < 800. \n";
			output+=String.format(strFormat,"Catagory " , "Details " );
			output+=String.format(strFormat, "Gpa", applicant.getGpa());
			output+=String.format(strFormat, "Sat", applicant.getSat());
			output+= String.format(strFormat, "Income", df.format(applicant.getIncome()));
			output+=String.format(strFormat, "Fletch score", df.format(EssayHandleing.getFletchScore(applicant.getEssay())));
			output+=String.format(strFormat, "Typos",df.format(dataMan.getEssayHandle().getTypos(applicant.getEssay(), dataMan)));
		
		}
		else {
			strFormat = "|%1$-15s|%2$-25s|%3$-10s|\n";
			applicant.setAI(calcAI(applicant,dataMan));
			dataMan.getPriorityQue().add(applicant);
			output+= String.format("|%1$-15s|%2$-25s|\n", "Current Status ", "WaitListed", "\n");
			output+="AI Calculation\n";
			output+=String.format(strFormat,"Catagory " , "Details " , "Effect on AI");
			output+=String.format(strFormat, "Gpa","Gpa*20", "+" + df.format(getGpaAI(applicant)));
			output+=String.format(strFormat, "Sat", "Sat/100", "+" + df.format(getSatAI(applicant)));
			output+= String.format(strFormat, "Income", "Income/10000", "+" + df.format(getIncomeAI(applicant)));
			output+=String.format(strFormat, "Fletch score", "Fletch score/5" , df.format(getFletchAI(applicant)));
			output+=String.format(strFormat, "Typos","Every typos per 100 words", df.format(getTyposAI(applicant,dataMan)));
			output+=String.format(strFormat, "","AI score",df.format(calcAI(applicant, dataMan)));
		}
		
		
		File file = Print(output,applicant);
		return file;
		
		
	}
	public static double getGpaAI(Applicant applicant) {
		return applicant.getGpa()*20;
	}
	public static double getFletchAI(Applicant applicant ) {
		double temp=EssayHandleing.getFletchScore(applicant.getEssay());
		return -(temp/5.0);
	}
	public static double getTyposAI(Applicant applicant,DataManager data) {
		return -EssayHandleing.getTypos(applicant.getEssay(),data);
	}
	public static double getIncomeAI(Applicant applicant) {
		return applicant.getIncome()/10000;
	}
	public static double getSatAI(Applicant applicant) {
		return applicant.getSat()/100;
	}
	public static double calcAI(Applicant applicant,DataManager data) {
		return getGpaAI(applicant)+getFletchAI(applicant)+getTyposAI(applicant,data)+getIncomeAI(applicant)+getSatAI(applicant);
	}

	private static File Print(String para,Applicant applicant) {
		File file = new File("decisions/" +applicant.getLast_Name() + "." + applicant.getFirst_Name() + ".decision.txt");
		try {
			PrintWriter pw = new PrintWriter(file);
			pw.print(para);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}
	
}
