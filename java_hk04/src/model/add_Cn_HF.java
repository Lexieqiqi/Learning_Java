package model;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class add_Cn_HF {
	public add_Cn_HF() {
		System.out.println("������ͻ�����:");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("��Ʊ̧ͷ��"+name);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		System.out.println("�������ڣ�"+df.format(new Date()));
		show_content sc = new show_content();
		sc.print();
		System.out.println("�ܼ�\t\t\t\t\t$"+(new Read_File().getcost()));
	}
}