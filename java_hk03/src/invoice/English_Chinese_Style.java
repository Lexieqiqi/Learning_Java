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
			DecimalFormat decimalFormat=new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
			System.out.println("INVOICE TITLE："+title1);
			System.out.println("Date of Sale："+this.getInvoice().getDate());
			System.out.println("发票抬头："+title2);
			System.out.println("销售日期："+this.getInvoice().getDate());
			System.out.println(this.getInvoice().getDescription());
			System.out.println("----------------------------------------------------------------------------");
			String p= decimalFormat.format(this.getInvoice().cost());//format 返回的是字符串
			System.out.println("Total\t\t\t\t\t$"+p);
			System.out.println("总计\t\t\t\t\t$"+p);
		}
	}

