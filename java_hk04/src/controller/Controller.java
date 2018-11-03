package controller;
import view.Interface;

import java.io.*;

import model.*;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Interface itf = new Interface();
		while(choice != 8) {
			itf.print();
			choice = itf.getChoice();
			switch(choice) {
				case 1:
					System.out.println("your select is 1:Show files content");
					show_content sc = new show_content();
					sc.print();
					break;
				case 2:
					System.out.println("your select is 2:Add a new invoice line");					
					Add_new_goods ng = new Add_new_goods();
					break;
				case 3:
					System.out.println("your select is 3:Update a selected Invoice");
					update_goods upg = new update_goods();
					break;
				case 4:
					System.out.println("your select is 4 : Delete a selected invoice line");
					del_goods deg = new del_goods();
					break;
				case 5:
					System.out.println("your select is 5 : Add a ChinaStyle Header and Footer");
					add_Cn_HF cf = new add_Cn_HF();
					break;
				case 6:
					System.out.println("your select is 6 : Add a AmericaStyle Header and Footer");
					add_En_HF ef = new add_En_HF();
					break;
				case 7:
					System.out.println("your select is 7 : Add mixed Header and Footer");
					add_mixed_HF mix = new add_mixed_HF(); 
					break;
				case 8:
					System.out.println("your select is 8:Exit");
					System.out.println("Are you sure to exit?(Y/N)");
					try {
						char c = (char)new BufferedReader(new InputStreamReader(System.in)).read();
						if(c == 'n' || c == 'N') {
							choice = 1;
						}
						if(c == 'Y' || c=='y') {
					        //
						}
					}
					catch(IOException e) {
						e.printStackTrace();
					}
					break;
			}
		}
	}
}

