package invoice;
import java.util.Date;
import java.text.SimpleDateFormat;


public abstract class Invoice {
	private String Title;
	private String Date;
	private String description = "Unknown";
	public void setTitle(String s) {
		Title = s;
	}
	public String getTitle() {
		return Title;
	}
	public String getDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		
		return df.format(new Date());
	}
	public void setDescription(String d) {
		this.description = d;
	}
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}
