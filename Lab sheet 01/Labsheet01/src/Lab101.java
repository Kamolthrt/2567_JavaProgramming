import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab101 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		DecimalFormat frm = new DecimalFormat("#,####.00");
		
		System.out.print("Input peoduct name  :");
		String productName = scan.nextLine();
		
		System.out.print("Input Product unit  :");
        int productUnit = scan.nextInt();
        
        System.out.print("Input pice per unit :");
        float productPrice = scan.nextFloat();
        
        System.out.println();
        System.out.println("Total price is  : "+ productPrice * );
        
        float totalPriceProduct = productUnit * productPrice ;
	}

}
