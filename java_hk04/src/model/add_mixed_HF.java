package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class add_mixed_HF {
	public add_mixed_HF() {
		char choice = 'y';
		String name = "";
		String header = "";
		String footer = "";
		while(choice == 'y' || choice =='Y') {
			System.out.println("We have following Header and Footer:\r\n" + 
					"\r\n" + 
					"1 : ChinaStyle Header and Footer\r\n" + 
					"2 : AmericaStyle Header and Footer\r\n" + 
					"");
			System.out.println("Input the Style of Header and Footer:");
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int flag = Integer.parseInt(br.readLine());
				if(flag == 1) {
					System.out.println("1 : ChinaStyle Header and Footer");
					System.out.println("������ͻ�������");
					Scanner scan = new Scanner(System.in);
					name = scan.nextLine();
					header = header + "\n"+"��Ʊ̧ͷ��"+name+"\n"+"�������ڣ�"+df.format(new Date());
					footer = "�ܼ�:"+(new Read_File().getcost())+footer + "\n";
				}	
				if (flag == 2) {
					System.out.println("2 : AmericaStyle Header and Footer");
					System.out.println("please input customer's name:");
					Scanner scan = new Scanner(System.in);
					name = scan.nextLine();
					header = header + "\n"+"Customer Name��"+name+"\n"+"Shopping Date��"+df.format(new Date());
					footer = footer + "\n"+"Total:"+(new Read_File().getcost());
				}
				
				
				System.out.println("Do you want add another Header and Footer?��Y/N��");
				choice = (char)new BufferedReader(new InputStreamReader(System.in)).read();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(header);
		show_content sc = new show_content();
		sc.print();
		System.out.println(footer);
	}
}