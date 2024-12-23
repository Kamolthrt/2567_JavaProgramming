import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		
	 InputStudent();
	}


	public static void InputStudent() {
		Scanner scanner = new Scanner(System.in);

		
		String studentID;	
		String subjectID;

		System.out.print("Enter Student Id: ");
		studentID = scanner.nextLine();

		System.out.print("Enter Subject Id: ");
		subjectID = scanner.nextLine();

		
		while (IsLength(studentID, subjectID)) {
			System.out.print("Enter Student Id: ");
			studentID = scanner.nextLine();

			System.out.print("Enter Subject Id: ");
			subjectID = scanner.nextLine();
		}

		
		System.out.println();

		
		System.out.print("student id: " + studentID);
		DisplayData(IsITStudent(studentID), IsITSubject(subjectID));

		scanner.close();
	}


	public static boolean IsLength(String stuID, String subID) {
		return (stuID.length() != 10 || subID.length() != 7);
	}


	public static boolean IsITStudent(String stuID) {
		return (stuID.contains("21311"));
	}


	public static boolean IsITSubject(String subID) {	
		return (subID.charAt(0) == '2' && subID.charAt(1) == '1' && subID.charAt(4) == '1');
	}
	


	private static void DisplayData(boolean stuID, boolean subID) {
		//if student is true
		if(stuID) {
			System.out.println(" 1st year student in IT");
		}
		else {
			System.out.println(" is not 1st year student in IT");
		}

		//if subject is true
		if(subID) {
			System.out.println("Enroll in course for Year 1");
		}
		else {
			System.out.println("not enroll in course for Year 1");
		}
	}

}
