import javax.swing.*;
public class Lab501_1 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting" ,"HR","Sales","Innovation"};
		boolean deptWasFound = false;
		
		String dept = JOptionPane.showInputDialog("Enter a department name");
		
		for(int i=0;i<deptName.length;i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
			
		}
		if(deptWasFound) {
			JOptionPane.showConfirmDialog(null, dept+"was found in the List");
			
		}else {
			JOptionPane.showConfirmDialog(null, dept+"was nat found in the list");
		}

	}

}
