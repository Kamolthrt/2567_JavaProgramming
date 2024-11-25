import java.util.Scanner;
import java.text.*;
public class javaexample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat frm = new DecimalFormat("#,####.00");
		
		System.out.print("Input peoduct name  :");
		String productName = scan.nextLine();
		
		System.out.print("Input product unit  :");
        int productUnit = scan.nextInt();
        
        System.out.print("Input pice per unit :");
        float productPrice = scan.nextFloat();
        
        System.out.println();
        System.out.println("Product name is : "+ productName);
        
        float totalPriceProduct = productUnit * productPrice ;
        System.out.println("Total price is " +frm.format(totalPriceProduct)+"bant.");
        float totalVat = totalPriceProduct + (totalPriceProduct * 7/100) ;
        System.out.println("Add VAT 7%  is "+frm.format(totalVat) +" Baht . ");
        
         //output using
        System.out.println("*****using println and String.format*****");
        System.out.printf("Product name is : %s",productName);
        System.out.printf("Total price is %,2f",totalPriceProduct);
        System.out.printf("Add Vat 7% is %s baht. ", String.format("%,2f",totalVat));
        
        scan.close();
	}

}
