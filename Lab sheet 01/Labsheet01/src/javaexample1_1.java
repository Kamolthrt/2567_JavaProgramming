import java.util.Scanner;
public class javaexample1_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		//รับข้อมูลด้วยnext
		System.out.print("Enter Youe first name(using next): ");
		String firstName = input.next();
		input.nextLine();
		
		System.out.print("Enter youe last name(using next) : ");
		String lastName = input.nextLine();
		
		System.out.println("\n------Output-------");
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		
		input.close();
		

	}

}
