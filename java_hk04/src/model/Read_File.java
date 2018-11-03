package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Read_File {
	private double cost = 0;
	public Read_File(){
		String dep = getDescription();
	}
	public String getDescription() {
		String description = "";
		
		try {
			// 在给定从中读取数据的文件名的情况下创建一个新 FileReader
			InputStreamReader reader = new InputStreamReader(new FileInputStream("d:\\shopping.txt"));
			// 创建一个使用默认大小输入缓冲区的缓冲字符输入流
			BufferedReader br = new BufferedReader(reader);
			//BufferedReader buffReader = new BufferedReader(reader);
	        String strTmp = "";
	        int count = 1;
	        int sum = this.getLine();
	        while((strTmp = br.readLine())!=null) {
	        	String[] s = strTmp.split("\t");
	        	cost = cost + Double.valueOf(s[s.length-1]);
	        	if(count == sum) {
	        		description = description + strTmp;
	        	}
	        	else {
	        		description = description + strTmp + "\n";
	        	}
	        	count += 1;
	        }
	        setcost(cost);
	        br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return description;
	}

	public void setcost(double c) {
		this.cost = c;
	}
	
	public double getcost() {
		return this.cost;
	}
	
	public int getLine() {
		int Line_sum = 0;
		try {
			InputStreamReader reader = new InputStreamReader(new FileInputStream("d:\\shopping.txt"));
			BufferedReader br = new BufferedReader(reader);
	        String strTmp = "";
	        
	        while((strTmp = br.readLine())!=null) {
	            Line_sum = 1 + Line_sum;
	        }
	        br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return Line_sum;
	}
	public void print() {
		System.out.println("===================================================================");
		System.out.println("No.    Item		unitPrice	units		subtotal");
		System.out.println(getDescription());
		System.out.println("===================================================================");		
	}
}
