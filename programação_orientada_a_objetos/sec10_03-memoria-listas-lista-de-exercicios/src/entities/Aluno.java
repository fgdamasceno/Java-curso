package entities;

public class Aluno {
	
	private String name;
	private double scoreA;
	private double scoreB;
	
	public Aluno(String name, double scoreA, double scoreB) {
		super();
		this.name = name;
		this.scoreA = scoreA;
		this.scoreB = scoreB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScoreA() {
		return scoreA;
	}

	public void setScoreA(double scoreA) {
		this.scoreA = scoreA;
	}

	public double getScoreB() {
		return scoreB;
	}

	public void setScoreB(double scoreB) {
		this.scoreB = scoreB;
	}
	
	

}
