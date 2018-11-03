package model;

public class show_content {
	public void print() {
		System.out.println("===================================================================");
		System.out.println("No.    Item		unitPrice	units		subtotal");
		System.out.println(new Read_File().getDescription());
		System.out.println("===================================================================");		
	}
}
