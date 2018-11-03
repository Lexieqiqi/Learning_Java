package invoice;
import java.text.DecimalFormat;

public class English_Chinese_Style extends HeaderAndFooter {
		private String title1;
		private String title2;
		English_Chinese_Style(Invoice invoice,String s1,String s2){
				this.setInvoice(invoice);
				title1 = s1;
				title2 = s2;
				this.print();
		}
		public void print() {
			DecimalFormat decimalFormat=new DecimalFormat(".00");//���췽�����ַ���ʽ�������С������2λ,����0����.
			System.out.println("INVOICE TITLE��"+title1);
			System.out.println("Date of Sale��"+this.getInvoice().getDate());
			System.out.println("��Ʊ̧ͷ��"+title2);
			System.out.println("�������ڣ�"+this.getInvoice().getDate());
			System.out.println(this.getInvoice().getDescription());
			System.out.println("----------------------------------------------------------------------------");
			String p= decimalFormat.format(this.getInvoice().cost());//format ���ص����ַ���
			System.out.println("Total\t\t\t\t\t$"+p);
			System.out.println("�ܼ�\t\t\t\t\t$"+p);
		}
	}

