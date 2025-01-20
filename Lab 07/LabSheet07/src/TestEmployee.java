
public class TestEmployee {

	public static void main(String[] args) {
		 // Create Employee
		 
		 Employee e1 = new Employee(8, "Peter", "Tan", 999);
	       System.out.println(e1);
	       // Test getters
	     
	       System.out.println("id is: " + e1.getId());
	       System.out.println("first name is: " + e1.getFirstName());
	       System.out.println("last name is: " + e1.getLastName());
	       System.out.println("salary is: " + e1.getSalary());
	       System.out.println("name is: " + e1.getName());
	       // Test getAnnualSalary	      
	       System.out.println("annual salary is: " + e1.getAnnualSalary());
	       // Test raiseSalary
	       System.out.println("RaiseSalary: " + e1.raiseSalary(10));
	       System.out.println(e1);
	   

	}

}
