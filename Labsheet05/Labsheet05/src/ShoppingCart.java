
public class ShoppingCart {

	public static void main(String[] args) {
	//ทดสอบรบบ shopping cart
		displayitemAndtotal("-Apple", 10.5," -Banana", 5.15,"-Orange",7.5);
		displayitemAndtotal("-Milk",  20.00,"-Bread", 15.0);
		displayitemAndtotal();
	}
//รับสินค้าและคำนวน
	public static void displayitemAndtotal(Object... items) { 
		if(items.length == 0) {
			System.out.println("No items in the cart.");
			return;
		}
		double totalPrice = 0.0;
		System.out.println("Item in the Cart :");
		for(int i=0;i<items.length;i+=2) {
			String ItemName = (String)items[i];
			double ItemPrice = (double)items[i+1];
			totalPrice += ItemPrice;
			
			System.out.printf("%s : $%.2f%n", ItemName, ItemPrice);
			
			
		}
		System.out.printf("Totalprice: $%.2f%n",totalPrice);
		System.out.println();
	}
}
