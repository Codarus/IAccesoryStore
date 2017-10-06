/**
 * Subclass of Accessory.
 * 
 * @author Christopher Hernandez
 * @version 1.0
 * @since June 30, 2016.
 */
public class ALenses extends Accessory {
	/**
	 * invokes constructor for Accessory, creates an
	 * accessory with a pre-set name, description, and price
	 */
	ALenses() {
		super("Lenses", "Camera lenses", 30.00);
	}
	/**
	 * invokes constructor for Accessory, creates a
	 * custom accessory with a name, description, and price
	 * 
	 * @param a String to be set as the name
	 * @param b String to be set as the desc
	 * @param c double to be set as the price
	 */
	ALenses(String a, String b, double c) {
		super(a,b,c);
	}

}
