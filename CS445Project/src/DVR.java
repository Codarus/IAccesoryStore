/**
 * Subclass of Product.
 * This class establishes DVRs and serves
 * as the basis for other, more specific types of DVR
 * classes to inherit from
 * 
 * @author Christopher Hernandez
 * @version 1.0
 * @since June 30, 2016.
 */
public class DVR extends Product {
	/**
	 * protected String prefix is the prefix to be placed bfore "DVR"
	 */
	protected String prefix;
	/**
	 * getter for prefix
	 * 
	 * @return prefix
	 */
	public String getPrefix(){
		return prefix;
	}
	/**
	 * setter for prefix
	 * 
	 * @param p String to be set as prefix
	 */
	public void setPrefix(String p){
		prefix = p;
	}
	/**
	 * constructor for DVR, creates a DVR
	 * with a prefix, name, description, id,
	 * and price
	 * 
	 * @param p String to be set as the prefix
	 * @param d String to be set as the desc
	 * @param pr double to be set as the price
	 */
	DVR(String p, String d, double pr){
		createDVR(p,d,pr);
	}
	/**
	 * Creates a DVR with a prefix, name,
	 * description, id, and price
	 * 
	 * @param p String to be set as the prefix
	 * @param d String to be set as the desc
	 * @param pr double to be set as the price
	 */
	public void createDVR(String p, String d, double pr){
		setName("DVR");
		setPrefix(p);
		setId();
		setDesc(d);
		setPrice(pr);
	}
	/**
	 * The toString method
	 * 
	 * @return String returns class variables one under the other
	 */
	public String toString(){
		return String.format(getPrefix() + " " + getName() + "\n" + getDesc()
		+ "\n" + getPrice() + "\n" + "Stock: " + getStock());
	}
}
