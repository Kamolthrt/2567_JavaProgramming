import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	       product[] productList = new product[4];
	       for (int i = 0; i < productList.length; i++) {
	           productList[i] = new product();
	           System.out.print("Input product Id   : ");
	           String id = scan.next();
	           productList[i].setId(id);
	           System.out.print("Input product Unit : ");
	           int unit = scan.nextInt();
	           productList[i].setUnit(unit);
	           System.out.print("Input product Price: ");
	           double price = scan.nextDouble();
	           productList[i].setPrice(price);
	           System.out.println();
	       }
	       double totalPrice = 0;
	       System.out.println("\n--------------------------------------");
	       for (product product : productList) {
	           double productTotal = product.calculate();
	           totalPrice += productTotal;
	           System.out.println("Product ID: " + product.getId() + ", Total price = " + productTotal + " baht.");
	       }
	       System.out.println("Total price of all products is " + totalPrice + " baht.");
	     
	       
	       scan.close();
	   

	}

}
