package model;
import java.io.*;

import java.util.Scanner;

public class del_goods extends Read_File{
	public del_goods() {
		System.out.println("Input the line No you want to delete:");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		System.out.println("Are you sure to delete?(Y/N)");
		try {
			char c = (char)new BufferedReader(new InputStreamReader(System.in)).read();
			System.out.println(c);
			if(c == 'Y' || c == 'y') {
				System.out.println("chosen");
				InputStreamReader reader = new InputStreamReader(new FileInputStream("d:\\shopping.txt"));
				BufferedReader br = new BufferedReader(reader);
		        String strTmp = "";
		        String description = "";
		        int count = 1;
		        int temp = 0;
		        while((strTmp = br.readLine())!=null) {
		            if(count != no) {
		            	if(count > no) {
		            		System.out.println(count);
		            		System.out.println(temp);
		            		String[] tp = strTmp.split("\t+");
		            		strTmp = (count-1) + "\t" + tp[1] + "\t\t" + tp[2] + "\t\t" + tp[3] + "\t\t" + tp[4];
				            if(count == this.getLine()) {
				            	description = description + strTmp;
				            }
				            else {
				            	description = description + strTmp + "\n";
				            }
		            	}
		            	else {
		            		description = description + strTmp + "\n";
		            	}
		            }
		            count = count + 1;
		        }
		        br.close();
		        BufferedWriter out = new BufferedWriter(new FileWriter("d:\\shopping.txt"));
		        out.write(description);
		        out.close();
				this.print();
			}
			if(c == 'N'|| c == 'n') {
				this.print();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
