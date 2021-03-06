package model;

import java.io.*;
import java.util.Scanner;

public class Goods_LinkList {
	public Node head;
	private int pos = 0;
	private int length = 0;
	public Goods_LinkList() {
		this.head = null;
	}
	public void add() {
		System.out.println("please input product name:");
		Scanner scan = new Scanner(System.in);
		String Item = scan.nextLine();
		
		System.out.println("please input price:");
		Scanner scan1 = new Scanner(System.in);
		double price = scan1.nextFloat();
		
		System.out.println("please input units:");
		Scanner scan2 = new Scanner(System.in);
		int units = scan2.nextInt();
		
		Node current = head;
		Node previous = head;
		Node n = new Node(Item,units,price);
		if(head == null) {
			head = n;
			n.next = null;
		}
		else {
			while(pos!=length) {
				pos++;
				previous = current;
				current = current.next;
			}
			n.next = current;
			previous.next = n;
		}
		length ++ ;
		pos = 0;
	}
	
	public void add_No() {
		Node current = head;
		Node previous = head;
		while(pos<length) {
			pos++;
			previous = current;
			current.No = pos;
			current = current.next;
		}
		pos = 0;
	}
	public void update() {
		System.out.println("please input the line No. of items:");
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		
		System.out.println("请输入需要更新的内容:");
		Scanner scan1 = new Scanner(System.in);
		int new_units = scan1.nextInt();
		
		Node current = head;
		Node previous = head;
		if(index > length) {
			System.out.println("Wrong index");
		}
		else {
			while(pos!=index) {
				previous = current;
				current = current.next;
				pos++;
			}
			current.units = new_units;
			pos = 0;
		}
	}
	
	public void delete() {
		Node current = head;
		Node previous = head;
		System.out.println("Input the line No you want to delete:");
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		System.out.println("Are you sure to delete?(Y/N)");
		try {
			char c = (char)new BufferedReader(new InputStreamReader(System.in)).read();
			System.out.println(c);
			if(c == 'Y' || c == 'y') {
				while(current.No!=index) {
					previous = current;
					current = current.next;
					pos++;
				}
				if(current == head) {
					head = head.next;
				}
				else {
					if(current.next == null) {
						current = null;
					}else {
						previous.next = current.next;
					}
					
				}
				length = length - 1;
				while(index < length) {
					index ++;
					current.No = current.No - 1;
					current = current.next;
				}
				pos = 0;
			}
			if(c == 'N'|| c == 'n') {
				//
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void print() {
		Node current = head;
		this.add_No();
		while(pos < length) {
			System.out.println(current.No+"\t"+current.name+"\t"+current.unitPrice+"\t"+current.units+"\t"+(current.unitPrice*current.units));
			current = current.next;
			pos++;
		}
	}
}
