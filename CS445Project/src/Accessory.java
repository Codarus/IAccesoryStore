/**
 * Subclass of Product.
 * This class establishes accessories and serves
 * as the basis for other, more specific types of accessory
 * classes to inherit from
 * 
 * @author Christopher Hernandez
 * @version 1.0
 * @since June 30, 2016.
 */
public class Accessory extends Product {
	/**
	 * constructor for Accessory, creates an
	 * accessory with a name, description, and price
	 * 
	 * @param n String to be set as the name
	 * @param d String to be set as the desc
	 * @param p double to be set as the price
	 */
	Accessory(String n, String d, double p){
		create(n,d,p);
	}
	/**
	 * Creates an accessory with a name, description, and price
	 * 
	 * @param n String to be set as the name
	 * @param d String to be set as the desc
	 * @param p double to be set as the price
	 */
	public void create(String n, String d, double p){
		setName(n);
		setId();
		setDesc(d);
		setPrice(p);
	}
	
}
