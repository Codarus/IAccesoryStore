/**
 * Subclass of SCam.
 * 
 * @author Christopher Hernandez
 * @version 1.0
 * @since June 30, 2016.
 */
public class SCamD extends SCam {
	/**
	 * invokes constructor for SCam, creates a
	 * security camera with a pre-set prefix, description, and price
	 */
	SCamD() {
		super("Digital","Camera that records digital video",230.00);
	}
	/**
	 * invokes constructor for SCam, creates a
	 * custom security camera with a prefix, description, and price
	 * 
	 * @param a String to be set as the name
	 * @param b String to be set as the desc
	 * @param c double to be set as the price
	 */
	SCamD(String a, String b, double c) {
		super(a,b,c);
	}

}
