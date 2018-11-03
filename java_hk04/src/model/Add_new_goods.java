package model;
import java.io.*;
import java.util.*;

public class Add_new_goods extends Read_File{
	public Add_new_goods() {
		System.out.println("please input product name:");
		Scanner scan = new Scanner(System.in);
		String Item = scan.nextLine();
		
		System.out.println("please input price:");
		Scanner scan2 = new Scanner(System.in);
		//scan2.nextLine();
		double price = scan2.nextFloat();
		System.out.println("please input units:");
		Scanner scan3 = new Scanner(System.in);
		int units = scan.nextInt();
		this.set_goods(Item,price,units);

	}
	public void set_goods(String item,double price,int units) {
		try {
			int num = this.getLine()+1;
			FileWriter write = new FileWriter("d:\\shopping.txt",true);
			//BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			//out.write("\r\n"+(num+1)+"   "+item+"\t\t"+price+"\t\t"+units+"\t\t"+price*units); 		
			//out.flush(); // 把缓存区内容压入文件
			if (num==1) {
				write.write(num+"\t"+item+"\t\t"+price+"\t\t"+units+"\t\t"+price*units);
			}
			else {
				write.write("\n"+num+"\t"+item+"\t\t"+price+"\t\t"+units+"\t\t"+price*units);
			}
			write.close();
			this.print();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
