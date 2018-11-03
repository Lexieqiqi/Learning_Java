package invoice;
import java.text.DecimalFormat;

public class EnglishStyle extends HeaderAndFooter {
	EnglishStyle(Invoice invoice,String s){
		this.setInvoice(invoice);
		this.getInvoice().setTitle(s);
		this.print();
	}
	public void print() {
		DecimalFormat decimalFormat=new DecimalFormat(".00");//���췽�����ַ���ʽ�������С������2λ,����0����.
		String p= decimalFormat.format(this.getInvoice().cost());//format ���ص����ַ���
		System.out.println("INVOICE TITLE��"+this.getInvoice().getTitle());
		System.out.println("Date of Sale��"+this.getInvoice().getDate());
		System.out.println(this.getInvoice().getDescription());
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Total\t\t\t\t\t$"+p);
	}
}
