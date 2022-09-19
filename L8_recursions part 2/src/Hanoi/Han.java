package Hanoi;

public class Han {

	private int numOfDisc;
	private static int n=1;
	public Han(int disc) {
		
		numOfDisc=disc;
		moveDiscs(numOfDisc,1,3,2);
	}
	
	private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
		if(num > 0) {
			moveDiscs(num-1,fromPeg,tempPeg,toPeg);
			System.out.println("Step " + n++ + " From a disc from peg " + fromPeg + " to " + toPeg);
			moveDiscs(num-1,tempPeg,toPeg,fromPeg);
		}
		
	}

}
