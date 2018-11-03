package invoice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Read extends Invoice {
	private double sum;
	private double cost;
	private Invoice invoice;
	
	public Read(Invoice invoice){
		this.invoice = invoice;
	}
	
	public void separate(String str) {
		String[] sep = str.split("\t");
		sum = Double.valueOf(sep[sep.length-1]);

		//String Item = str.substring(0, count[0]);
		//System.out.println(name);
		//double single = Double.valueOf(str.substring(count[0]+1,count[1]));
		//System.out.println(single);
		//int num = Integer.parseInt(str.substring(count[1]+1,count[2]));
		//System.out.println(num);
		//sum = Double.valueOf(str.substring(count[2]+1,str.length()));
		//System.out.println(sum);
		cost = cost + sum;
	}	

	public double cost() {
		return cost + this.invoice.cost();
	}

	public String getDescription() {
		String description = "";
		try {
			// �ڸ������ж�ȡ���ݵ��ļ���������´���һ���� FileReader
			InputStreamReader reader = new InputStreamReader(new FileInputStream("d:\\shopping.txt"));

			// ����һ��ʹ��Ĭ�ϴ�С���뻺�����Ļ����ַ�������
			BufferedReader br = new BufferedReader(reader);

			//BufferedReader buffReader = new BufferedReader(reader);
	        String strTmp = "";
	        while((strTmp = br.readLine())!=null){
	            separate(strTmp);
	            description = strTmp + "\n"+description  ;
	        }
	        br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return this.invoice.getDescription()+description;
	}
}