package invoice;
import java.text.DecimalFormat;

public class ChineseStyle extends HeaderAndFooter {
	ChineseStyle(Invoice invoice,String s){
		this.setInvoice(invoice);
		this.getInvoice().setTitle(s);
		this.print();
	}
	public void print() {
		DecimalFormat decimalFormat=new DecimalFormat(".00");//���췽�����ַ���ʽ�������С������2λ,����0����.

		System.out.println("��Ʊ̧ͷ��"+this.getInvoice().getTitle());
		System.out.println("�������ڣ�"+this.getInvoice().getDate());
		System.out.println("INVOICE TITLE��"+this.getInvoice().getTitle());
		System.out.println("Date of Sale��"+this.getInvoice().getDate());
		System.out.println(this.getInvoice().getDescription());
		System.out.println("----------------------------------------------------------------------------");
		String p= decimalFormat.format(this.getInvoice().cost());//format ���ص����ַ���
		System.out.println("�ܼ�\t\t\t\t\t$"+p);
	}
}