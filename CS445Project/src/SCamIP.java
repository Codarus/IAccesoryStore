/**
 * Subclass of SCam.
 * 
 * @author Christopher Hernandez
 * @version 1.0
 * @since June 30, 2016.
 */
public class SCamIP extends SCam {
	/**
	 * invokes constructor for SCam, creates a
	 * security camera with a pre-set prefix, description, and price
	 */
	SCamIP() {
		super("Ip","Security Camera with IP support",200.00);
	}
	/**
	 * invokes constructor for SCam, creates a
	 * custom security camera with a prefix, description, and price
	 * 
	 * @param a String to be set as the name
	 * @param b String to be set as the desc
	 * @param c double to be set as the price
	 */
	SCamIP(String a, String b, double c) {
		super(a,b,c);
	}

}
