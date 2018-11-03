package controller;
import java.io.*;

import model.*;
import view.*;

public class Controller {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Interface itf = new Interface();
		Goods_LinkList gl = new Goods_LinkList();
		while(choice != 8) {
			itf.print();
			choice = itf.getChoice();
			switch(choice) {
				case 1:
					System.out.println("your select is 1:Show files content");
					gl.print();
					break;
				case 2:
					System.out.println("your select is 2:Add a new invoice line");	
					gl.add();
					break;
				case 3:
					System.out.println("your select is 3:Update a selected Invoice");
					gl.update();
					break;
				case 4:
					System.out.println("your select is 4 : Delete a selected invoice line");
					gl.delete();
					break;
				case 5:
					System.out.println("your select is 5 : Add a ChinaStyle Header and Footer");
					break;
				case 6:
					System.out.println("your select is 6 : Add a AmericaStyle Header and Footer");
					break;
				case 7:
					System.out.println("your select is 7 : Add mixed Header and Footer");
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
