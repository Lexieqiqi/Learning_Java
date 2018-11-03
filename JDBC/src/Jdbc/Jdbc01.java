package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc01 {
	public void wholeExample(){
		try {
			//1.ע������
			Class.forName("com.mysql.jdbc.Driver");
			//2.��ȡ���ݿ�����
			String Url= "jdbc:mysql://localhost:3306/test";
			Connection conn = DriverManager.getConnection(Url,"root","123456");
			//3.����ִ�о��
			Statement stmt =conn.createStatement();
			//4.ִ��sql���
			ResultSet rs = stmt.executeQuery("select id from user");
			//5.����ִ�н��
			while(rs.next()){
				System.out.println(
				"id:" + rs.getInt(1)
				+"\tname:" + rs.getString(2)
				+"\tbirthday:" + rs.getDate(3)
				+"\tmoney:" + rs.getFloat(4));
			}
			//6.�ͷ���Դ
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
