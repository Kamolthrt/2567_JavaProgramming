
public class student {
	private String studentName;
	private int studentScore;
	
	//Setters and Getters Method
	public void setName(String stdName) {
		studentName = stdName;		
	}
	
	public String getName() {
		return studentName;
	}
	
	public void setScore(int stdscore) {
		studentScore = stdscore;		
	}
	
	public int getScore() {
		return studentScore;
	}
	
	//Check the score is within the valid range(0-100)
	public boolean checkScore() {
	/*	if(getScore()>=0 && getScore()<=100) {
			return true;			
		}else {
			return false;			
		} */
	/*	if(getScore()>=0 && getScore()<=100) 
			return true;
		return false; */
		
		return getScore()>=0 && getScore()<=100;
	}
	
	//Check the student passe(score > = 50)
	public boolean isPass() {
	/*	if(getScore()>=50) return true;
		return false; */
		return getScore()>=50;
	}	

}
