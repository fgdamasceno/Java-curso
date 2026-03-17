package entities;

public class Student {
	
	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	
	public double calcFinalGrade() {
		return firstGrade + secondGrade + thirdGrade;
	}
	
	public double calcMissingPoints() {
		return isApproved() ? 0 : 60 - calcFinalGrade();
	}
	
	public boolean isApproved() {
		return calcFinalGrade() >= 60;
	}

}
