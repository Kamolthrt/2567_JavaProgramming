import javax.swing.*;
public class Labsheet501 {

	public static void main(String[] args) {
		int[]idProduct = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] priceProduct = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	double itemPrice = 0;
	boolean validitem = false;//เปรียบเทียบ
	
	int ItemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to Order"));
	
	for (int i=0; i<idProduct.length;i++) {
		if (ItemOrder == idProduct[i]) {
			itemPrice = priceProduct[i] ;
			validitem = true;
				
			}
		}
	if(validitem) {
		JOptionPane.showConfirmDialog(null,"Item " + ItemOrder+" is "+itemPrice);
		System.out.print("Item " +ItemOrder+"is"+itemPrice);
	}else {
		System.out.print("Invalid Item");
	}
	}

}
