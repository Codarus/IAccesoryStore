/**
 * 
 * This class establishes and handles customer
 * and employee accounts
 * 
 * @author Christopher Hernandez
 * @version 1.0
 * @since June 30, 2016.
 */
public class Account {
	/**
	 * private String name holds the name of the account holder
	 * private String pass holds the password of the account holder
	 * private String email holds the email address of the account holder
	 * private String address holds the street address of the account holder
	 * private double cart holds the card number of the account holder
	 * private int id holds the unique id of the account holder
	 */
	private String name;
	private String pass;
	private String email;
	private String address;
	private double card;
	private int id = 10000;
	/**
	 * constructor for Account, creates an account with
	 * a name, email, and password
	 * 
	 * @param n String to be set as the account name
	 * @param e String to be set as the account email
	 * @param p String to be set as the account password
	 */
	Account(String n, String e, String p){
		createAccount(n,e,p);
	}
	/**
	 * constructor for Account, creates an account with
	 * a name and password
	 * 
	 * @param n String to be set as the account name
	 * @param p String to be set as the account password
	 */
	Account(String n, String p){
		createLogin(n,p);
	}
	/**
	 * constructor for Account, creates an unregistered account with
	 * an address and card number
	 * 
	 * @param a String to be set as the account address
	 * @param c double to be set as the account card number
	 */
	Account(String a, double c){
		setInfo(a,c);
	}
	/**
	 * default constructor for Account
	 */
	Account(){}
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
	 * getter for pass
	 * 
	 * @return pass
	 */
	public String getPass(){
		return pass;
	}
	/**
	 * setter for pass
	 * 
	 * @param n String to be set as pass
	 */
	public void setPass(String n){
		pass = n;
	}
	/**
	 * getter for email
	 * 
	 * @return email
	 */
	public String getEmail(){
		return email;
	}
	/**
	 * setter for email
	 * 
	 * @param n String to be set as email
	 */
	public void setEmail(String n){
		email = n;
	}
	/**
	 * getter for address
	 * 
	 * @return address
	 */
	public String getAddress(){
		return address;
	}
	/**
	 * setter for address
	 * 
	 * @param n String to be set as address
	 */
	public void setAddress(String n){
		address = n;
	}
	/**
	 * getter for card
	 * 
	 * @return card
	 */
	public double getCard(){
		return card;
	}
	/**
	 * setter for card
	 * 
	 * @param n String to be set as card
	 */
	public void setCard(double n){
		card = n;
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
	 * creates an account with a name, email, and pass
	 * 
	 * @param n String to be set as the account name
	 * @param e String to be set as the account email
	 * @param p String to be set as the account pass 
	 */
	public void createAccount(String n, String e, String p){
		name = n;
		pass = p;
		email = e;
		setId();
	}
	/**
	 * creates an account with a name and pass
	 * 
	 * @param n String to be set as the account name
	 * @param p String to be set as the account pass 
	 */
	public void createLogin (String n, String p){
		name = n;
		pass = p;
	}
	/**
	 * creates an account with an address and card number
	 * 
	 * @param a String to be set as the address
	 * @param c double to be set as the card
	 */
	public void setInfo(String a, double c){
		address = a;
		card = c;
	}
	/**
	 * Checks if a person is logging in is Bob
	 * 
	 * @param username String to compared to Bob
	 * @param pass String to be compared to 123
	 * @return bool Boolean to be returned true if person is Bob,
	 * else return false
	 */
	public boolean eLogin(String username, String pass){
		boolean bool = false;
		if (username.equals("Bob") && pass.equals("123")){
			bool = true;
		}
				
		return bool;
	}
	
}
