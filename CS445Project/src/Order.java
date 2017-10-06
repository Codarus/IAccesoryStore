import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 
 */

/**
 * @author Christopher
 *
 */
public class Order {
	private String timestamp;
	private double total;
	private int id = 100000;
	
	Order(double d){
		createOrder(d);
	}
	
	public String getTimestamp(){
		return timestamp;
	}
	public void setTimestamp(){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String t = f.format(calendar.getTime());
		
		timestamp = t;
	}
	
	public double getTotal(){
		return total;
	}
	public void setTotal(double f){
		total = f;
	}
	
	public int getId(){
		return id;
	}
	public void setId(){
		id++;
	}
	
	public void createOrder(double d){
		setTimestamp();
		total = d;
		setId();
	}
}
