package invoice;
import java.text.DecimalFormat;

public class EnglishStyle extends HeaderAndFooter {
	EnglishStyle(Invoice invoice,String s){
		this.setInvoice(invoice);
		this.getInvoice().setTitle(s);
		this.print();
	}
	public void print() {
		DecimalFormat decimalFormat=new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
		String p= decimalFormat.format(this.getInvoice().cost());//format 返回的是字符串
		System.out.println("INVOICE TITLE："+this.getInvoice().getTitle());
		System.out.println("Date of Sale："+this.getInvoice().getDate());
		System.out.println(this.getInvoice().getDescription());
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Total\t\t\t\t\t$"+p);
	}
}
