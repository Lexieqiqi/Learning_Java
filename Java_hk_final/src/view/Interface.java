package view;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import model.*;

public class Interface {
	int choice;
	public void print() {
		System.out.print("Select the follow No£º\r\n" + 
				"\r\n" + 
				"1 : Show files content\r\n" + 
				"2 : Add a new invoice line\r\n" + 
				"3 : Update a selected Invoice\r\n" + 
				"4 : Delete a selected invoice line\r\n" + 
				"5 : Add a ChinaStyle Header and Footer\r\n" + 
				"6 : Add a AmericaStyle Header and Footer\r\n" + 
				"7 : Add mixed Header and Footer \r\n" + 
				"8 : Exit\r\n" + 
				"");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int flag = Integer.parseInt(br.readLine());
			setChoice(flag);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public int getChoice() {
		return this.choice;
	}
}
