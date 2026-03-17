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
		return 60 - calcFinalGrade();
	}
	
	public void isApproved() {
		if (calcFinalGrade() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", calcMissingPoints());			
		}
	}

}
