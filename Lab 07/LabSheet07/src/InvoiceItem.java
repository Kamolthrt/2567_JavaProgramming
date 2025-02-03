
public class InvoiceItem {
	 private String id;
	   private String desc;
	   private int qty;
	   private double unitPrice;
	   
	   public String getId() {
	       return this.id;
	   }
	   public void setid(String id) {
			this.id= id;
	   }
	   public String getDesc() {
	       return this.desc;
	   }
	   public void setdesc(String desc) {
			this.desc= desc;
	   }
	   public int getQty() {
	       return this.qty;
	   }
	   public void setqty(int qty) {
			this.qty= qty;
			
	   }
	   public double getUnitPrice() {
	       return this.unitPrice;
	   }
	   public void setunitPrice(double unitPrice) {
			this.unitPrice= unitPrice;
	   }
	   public void setQty(int qty) {
	       this.qty = qty;
	   }
	   public void setUnitPrice(double unitPrice) {
	       this.unitPrice = unitPrice;
	   }
	   
	   public double getTotal() {
	       return this.qty * unitPrice;
	   }
	   
	   public String toString() {
	       return "InvoiceItem[id=" + id +", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	   }
}
