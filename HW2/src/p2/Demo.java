package p2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "judhfuidshfuihnsdf";
		String[] temp = words.split("");
		for(int i = temp.length-1;i>-1;i--) {
			System.out.print(temp[i]);
		}

	}

}
