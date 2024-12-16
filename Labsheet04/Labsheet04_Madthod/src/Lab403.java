import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName;
		String firstName;

		System.out.println("Plase enter your name, separated by a space. ");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' ');
		firstName = fullName.substring(0,space);
		
		System.out.println(abbreviatName(fullName));
		input.close();
	}

	public static String abbreviatName(String fullName) {
		String initialLetter="";
		
		for(int i=0;i<fullName.length();i++) {
			if(fullName.charAt(i)==' ') {
				initialLetter = (initialLetter+fullName.charAt(i+1)).toUpperCase();
				initialLetter = initialLetter+".";
			}
		}
		return initialLetter;
	}
}
