package model;

public class Node {
	//������
	protected int No;
	public void setNo(int n) {
		this.No= n;
	}
	protected String name;
	protected int units;
	protected double unitPrice;
	public Node(String n,int u,double p) {
		this.name = n;
		this.units = u;
		this.unitPrice = p;
	}
	protected Node pre;   //ָ����
	protected Node next;  //ָ����
}
