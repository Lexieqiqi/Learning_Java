package invoice;

public class HeaderAndFooter extends Invoice {
	private Invoice invoice;
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Invoice getInvoice() {
		return this.invoice;
	}
	public double cost() {
		return this.invoice.cost();
	}
}
