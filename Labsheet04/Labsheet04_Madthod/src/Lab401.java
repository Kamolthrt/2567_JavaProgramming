import javax.swing.*;
public class Lab401 {
	
	//กำหนดตัวแปร ใช้ได้ทุกเมดธอด
	static String varEmail;

	public static void main(String[] args) {
		inputEmail();

	}//end
public static void inputEmail() {
	String ans="";
	do {
		varEmail = JOptionPane.showInputDialog("Input your e-mail:");
		if(varEmail != null && !varEmail.isEmpty()) {//	ไม่เป็นค่าว่าง
			checkEmailError(varEmail);
		}else {
			JOptionPane.showConfirmDialog(null, "Email cannot be emply:");
		}
		ans = JOptionPane.showInputDialog("Continue? (y||Y to continue)");
		
	}while(ans!=null && ans.contentEquals("y") );
	}//end


public static void checkEmailError(String email) {
while(email.startsWith("@")|| email.contains(" ")) {
	email = JOptionPane.showInputDialog("Input your e-mail again: ");
}
email = email.toLowerCase();
JOptionPane.showConfirmDialog(null,
		checkEmail (email)
		?"Your email is"+email
        :"Your email is not hotmail or gmail address.");
	
   }
public static boolean checkEmail(String email) {
	/*if(email.endsWith("@gmail.come")||email.endsWith("@hotmail.com")) {
	return true;
}else {
	return false;
}*/
		return email.endsWith("@gmail.come")||email.endsWith("@hotmail.com");
	}
}

