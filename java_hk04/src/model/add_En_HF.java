package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class add_En_HF {
	public add_En_HF() {
		System.out.println("please input customer's name:");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Customer Name："+name);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println("Shopping Date："+df.format(new Date()));
		show_content sc = new show_content();
		sc.print();
		System.out.println("Total\t\t\t\t\t$"+(new Read_File().getcost()));
	}
}
