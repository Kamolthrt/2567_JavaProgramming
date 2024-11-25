import javax.swing.*;
public class javaexample2 {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("Input Product Name: ");
		
		String productUnitStr = JOptionPane.showInputDialog("Input product Unit");
		//input product unit
		int productUnit = Integer.parseInt(productUnitStr);
		//input price per unit
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit"));
		
		double totalPrice = productPrice * productUnit ;
		double totalVat = totalPrice + (totalPrice * 7/100);
		
		
		String frmtotalPrice = String.format("%,.2f",totalPrice);
		String frmtotalVat  = String.format("%,.2f",totalVat);
		JOptionPane.showInternalMessageDialog(null,"total price is "+ frmtotalPrice + "baht.");

	}

}
