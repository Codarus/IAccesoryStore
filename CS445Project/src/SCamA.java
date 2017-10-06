/**
 * Subclass of SCam.
 * 
 * @author Christopher Hernandez
 * @version 1.0
 * @since June 30, 2016.
 */
public class SCamA extends SCam {
	/**
	 * invokes constructor for SCam, creates a
	 * security camera with a pre-set prefix, description, and price
	 */
	SCamA() {
		super("Analog","Camera that records analog video",100.00);
	}
	/**
	 * invokes constructor for SCam, creates a
	 * custom security camera with a prefix, description, and price
	 * 
	 * @param a String to be set as the name
	 * @param b String to be set as the desc
	 * @param c double to be set as the price
	 */
	SCamA(String a, String b, double c) {
		super(a,b,c);
	}

}
