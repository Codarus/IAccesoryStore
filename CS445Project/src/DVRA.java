/**
 * Subclass of DVR.
 * 
 * @author Christopher Hernandez
 * @version 1.0
 * @since June 30, 2016.
 */
public class DVRA extends DVR {
	/**
	 * invokes constructor for DVR, creates a
	 * DVR with a pre-set prefix, description, and price
	 */
	DVRA() {
		super("Analog", "Analog recording device", 250.00);
	}
	/**
	 * invokes constructor for DVR, creates a
	 * custom DVR with a prefix, description, and price
	 * 
	 * @param a String to be set as the name
	 * @param b String to be set as the desc
	 * @param c double to be set as the price
	 */
	DVRA(String a, String b, double c) {
		super(a,b,c);
	}
}
