/**
 * 
 * This class establishes and handles items and serves
 * as the basis for other, more specific types of item
 * classes to inherit from
 * 
 * @author Christopher Hernandez
 * @version 1.0
 * @since June 30, 2016.
 */
class Product {
	/**
	 * protected String name is the name of the item
	 * protected String desc is the description of the item
	 * protected double price is the price of the item
	 * protected int stock is the stock of the item
	 * protected int id is the unique id of the item
	 */
	protected String name;
	protected String desc;
	protected double price;
	protected int stock = 50;
	protected int id = 1000;
	/**
	 * getter for name
	 * 
	 * @return name
	 */
	public String getName(){
		return name;
	}
	/**
	 * setter for name
	 * 
	 * @param n String to be set as name
	 */
	public void setName(String n){
		name = n;
	}
	/**
	 * getter for desc
	 * 
	 * @return desc
	 */
	public String getDesc(){
		return desc;
	}
	/**
	 * setter for desc
	 * 
	 * @param n String to be set as desc
	 */
	public void setDesc(String n){
		desc = n;
	}
	/**
	 * getter for price
	 * 
	 * @return price
	 */
	public double getPrice(){
		return price;
	}
	/**
	 * setter for price
	 * 
	 * @param n double to be set as price
	 */
	public void setPrice(double n){
		price = n;
	}
	/**
	 * getter for stock
	 * 
	 * @return stock
	 */
	public int getStock(){
		return stock;
	}
	/**
	 * setter for stock
	 * 
	 * @param n int to be set as stock
	 */
	public void setStock(int n){
		stock = n;
	}
	/**
	 * increment stock
	 */
	public void stockIncreased(){
		stock++;
	}
	/**
	 * decrement stock
	 */
	public void stockDecreased(){
		stock--;
	}
	/**
	 * getter for id
	 * 
	 * @return id
	 */
	public int getId(){
		return id;
	}
	/**
	 * setter for id, increments id
	 */
	public void setId(){
		id++;
	}
	/**
	 * The toString method
	 * 
	 * @return String returns class variables one under the other
	 */
	public String toString(){
		return String.format(getName() + "\n" + getDesc()
		+ "\n" + getPrice() + "\n" + "Stock: " + getStock());
	}

}
