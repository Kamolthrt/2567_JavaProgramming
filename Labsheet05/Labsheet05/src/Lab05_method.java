import javax.swing.*;
public class Lab05_method {

	static int[]idProduct = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] priceProduct = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	static double itemPrice = 0;
	static boolean validitem = false;
	
	
	public static void main(String[] args) {
		inputItem();
	}
		public static void inputItem () {
		int ItemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		
		if(checkItem(ItemOrder)) {
			System.out.print("item " +ItemOrder+"is"+itemPrice);
		
			
		}else {
			System.out.print("Invalid Item");
		}

	}
		public static boolean checkItem(int item) {
			for(int i=0; i<idProduct.length;i++) {
				if (item == idProduct[i]) {
					itemPrice = priceProduct[i] ;
					validitem = true;
		}
		}
		return validitem;
}
		
		
}
