package invoice;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice = new MainPart();
		invoice = new Read(invoice);
		invoice = new Goods(invoice,"Fire Wheel Tire",4,154.3);
		invoice = new Goods(invoice,"Front Fender",1,300.45);
		Chinese_English_Style test = new Chinese_English_Style(invoice,"������","HIT");
	}
}
