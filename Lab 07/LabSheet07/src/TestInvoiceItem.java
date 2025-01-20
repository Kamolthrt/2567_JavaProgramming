
public class TestInvoiceItem {
	public static void main(String[] args) {
		// Test constructor and toString()
		InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
		System.out.println(inv1); // toString();
		// Test Setters and Getters
		inv1.setQty(999);
		inv1.setUnitPrice(0.99);
		System.out.println(inv1); // toString();
	}

}
