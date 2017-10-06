/**
 * 
 * This class is the portal to the store
 * customers can register, login, and shop
 * and our employee, Bob, can implement CRUD
 * functions on the merchandise
 * 
 * @author Christopher Hernandez
 * @version 1.0
 * @since June 30, 2016.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Client {
	/**
	 * This is the main method which allows customers to register, login, and shop
	 * employees (Bob) may also login and modify merchandise values via CRUD.
	 * 
	 * The main method makes use of all other classes (Product is inherited by all
	 * classes besides Account, Order, and Client). Accessory, SCam, and DVR inherit
	 * from Product and are inherited by their various subclasses.
	 */
	public static void main(String[] args) {
		/**
		 * First, the variables are created.
		 * 
		 * Boolean x controls the state of the while loops (customer/employee sessions)
		 * double total takes the total of all items in the "cart" to be fed into into the order
		 * double card holds the user's credit card number to be fed into the order
		 * String address holds the user's address to be fed into the order
		 * List y holds the name of an item placed into the cart
		 * List yDesc holds the description of an item placed into the cart
		 * List yPrice holds the price of an item placed into the cart
		 * List p holds an object placed into the cart
		 * String response - response3, int dub, and double dval are all variables to hold scanner user input
		 */
		Boolean x = true;
		double total = 0;
		double card;
		String address;
		List<String> y = new ArrayList<String>();
		List<String> yDesc = new ArrayList<String>();
		List<Double> yPrice = new ArrayList<Double>();
		List<Product> p = new ArrayList<Product>();
				
		String response;
		String response1;
		String response2;
		String response3;
		int dub;
		double dval;
		/**
		 * Instances are then created.
		 * 
		 * abrackets is an instance of Abrackets
		 * acables is an instance of ACables
		 * hc is an instance of AConnectors
		 * ah is an instance fo AHousings
		 * airl is an instance of AIRLighting
		 * al is an instance of ALenses
		 * am is an instance of AMicrophones
		 * amon is an instance of AMonitors
		 * aps is an instance fo APowSupplies
		 * 
		 * drvh is an instance of DRVH
		 * dvra is an instance of DVRA
		 * dvrd is an instance fo DVRD
		 * 
		 * scama is an instance of SCamA
		 * scamd is an instance of SCamD
		 * scamip is an instance of SCamIP
		 */
		ABrackets abrackets = new ABrackets();
		ACables acables = new ACables();
		AConnectors hc = new AConnectors();
		AHousings ah = new AHousings();
		AIRLighting airl = new AIRLighting();
		ALenses al = new ALenses();
		AMicrophones am = new AMicrophones();
		AMonitors amon = new AMonitors();
		APowSupplies aps = new APowSupplies();
		
		DRVH drvh = new DRVH();
		DVRA dvra = new DVRA();
		DVRD dvrd = new DVRD();
		
		SCamA scama = new SCamA();
		SCamD scamd = new SCamD();
		SCamIP scamip = new SCamIP();
		/**
		 * First asks user if they have an account
		 * 
		 * if they do, the user is prompted for a username and password
		 * if that password matches our employee, name=Bob pass=123, they
		 * are then allowed to perform CRUD operations on merchandise. If
		 * they are not employees they continue on as shoppers
		 * 
		 * if they do not, the user is asked if they would like to create
		 * an account.
		 * 
		 * if they do, they are prompted for a username, password, and their
		 * email. The non-sensitive information
		 * is then displayed as confirmation and they are registered. They
		 * will then continue on as shoppers
		 * 
		 * if they do not, they continue on as an unregistered shopper
		 * 
		 * A shopper will first be shown all available inventory, with a
		 * corresponding reference number and other info related to the product.
		 * The user will be asked to enter the number of a desired item, after
		 * which they will be asked to either add that item to the cart or
		 * return to the main menu.
		 * If the item is added, the user will be prompted to either checkout
		 * or return to the main menu.
		 * If the user proceeds to checkout their total will be calculated and
		 * displayed and they will be asked for their address and card number.
		 * They will be shown their order details and be asked if they wish to
		 * submit the order or return to the main menu.
		 * If they submit the order the order confirmation is displayed.
		 * They will then be prompted to continue shopping or quit.
		 * 
		 * Both customer and employee sessions are contained in a respective
		 * while loop, controlled by the x variable.
		 * Choices are entered by a scanner and handled by if and/or switch
		 * statements.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you have an account? y/n");
		response = input.next();
		if (response.equals("n")){
			System.out.println("Would you like to create an account?");
			response = input.next();
			if (response.equals("y")){
				System.out.println("Please enter your name");
				response1 = input.next();
				System.out.println("Please enter your email");
				response2 = input.next();
				System.out.println("Please enter a password");
				response3 = input.next();
				Account account = new Account(response1,response2,response3);
				
				System.out.println("\nAccount Created");
				System.out.println("Name: " + account.getName());
				System.out.println("Email: " + account.getEmail());
				System.out.println("Password: *****\n");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}else if(response.equals("y")){
			System.out.println("Username:");
			response = input.next();
			System.out.println("Password:");
			response1 = input.next();
			Account person = new Account(response,response1);
			boolean bool = person.eLogin(response,response1);
			if (bool == true){
				//begin crud
				while(x==true){
					
					System.out.print("###Inventory###\n");
					if (abrackets.getStock() != 0)
						System.out.print("#1\n" + abrackets + "\n\n");
					if (acables.getStock() != 0)
						System.out.print("#2\n" + acables + "\n\n");
					if (hc.getStock() != 0)
						System.out.print("#3\n" + hc + "\n\n");
					if (ah.getStock() != 0)
						System.out.print("#4\n" + ah + "\n\n");
					if (airl.getStock() != 0)
						System.out.print("#5\n" + airl + "\n\n");
					if (al.getStock() != 0)
						System.out.print("#6\n" + al + "\n\n");
					if (am.getStock() != 0)
						System.out.print("#7\n" + am + "\n\n");
					if (amon.getStock() != 0)
						System.out.print("#8\n" + amon + "\n\n");
					if (aps.getStock() != 0)
						System.out.print("#9\n" + aps + "\n\n");
					if (drvh.getStock() != 0)
						System.out.print("#10\n" + drvh + "\n\n");
					if (dvra.getStock() != 0)
						System.out.print("#11\n" + dvra + "\n\n");
					if (dvrd.getStock() != 0)
						System.out.print("#12\n" + dvrd + "\n\n");
					if (scama.getStock() != 0)
						System.out.print("#13\n" + scama + "\n\n");
					if (scamd.getStock() != 0)
						System.out.print("#14\n" + scamd + "\n\n");
					if (scamip.getStock() != 0)
						System.out.print("#15\n" + scamip + "\n\n");
					
					System.out.println("Please select any desired items by #");
					dub = input.nextInt();
					
					switch (dub){
					case 1: System.out.print(abrackets);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
										+ "p for price, s for stock)");
										response = input.next();
										switch (response){
										case "n":	System.out.println("Please enter new value");
													response = input.next();
													abrackets.setName(response);
													System.out.println("Name changed to " + response);
													break;
										case "d":	System.out.println("Please enter new value");
													response = input.next();
													abrackets.setDesc(response);
													System.out.println("Description changed to " + response);
													break;
										case "p":	System.out.println("Please enter new value");
													dval = input.nextDouble();
													abrackets.setPrice(dval);
													System.out.println("Price changed to " + dval);
													break;
										case "s":	System.out.println("Please enter new value");
													dub = input.nextInt();
													abrackets.setName(response);
													System.out.println("Stock changed to " + dub);
													break;
										}
										break;
										
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											abrackets.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										ABrackets newabrackets = new ABrackets(response,response1,dval);
										System.out.println(newabrackets);
										break;
							case "n": 	continue;
							}
							break;
					case 2: System.out.print(acables);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											acables.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											acables.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											acables.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											acables.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											acables.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										ACables newacables = new ACables(response,response1,dval);
										System.out.println(newacables);
										break;
							case "n": 	continue;
							}
							break;
					case 3: System.out.print(hc);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											hc.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											hc.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											hc.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											hc.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											hc.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										AConnectors newhc = new AConnectors(response,response1,dval);
										System.out.println(newhc);
										break;
							case "n": 	continue;
							}
							break;
					case 4: System.out.print(ah);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											ah.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											ah.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											ah.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											ah.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											ah.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										AHousings newah = new AHousings(response,response1,dval);
										System.out.println(newah);
										break;
							case "n": 	continue;
							}
							break;
					case 5: System.out.print(airl);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											airl.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											airl.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											airl.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											airl.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											airl.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										AIRLighting newairl = new AIRLighting(response,response1,dval);
										System.out.println(newairl);
										break;
							case "n": 	continue;
							}
							break;
					case 6: System.out.print(al);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											al.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											al.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											al.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											al.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											al.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										ALenses newal = new ALenses(response,response1,dval);
										System.out.println(newal);
										break;
							case "n": 	continue;
							}
							break;
					case 7: System.out.print(am);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											am.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											am.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											am.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											am.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											am.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										AMicrophones newam = new AMicrophones(response,response1,dval);
										System.out.println(newam);
										break;
							case "n": 	continue;
							}
							break;
					case 8: System.out.print(amon);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											amon.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											amon.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											amon.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											amon.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											amon.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										AMonitors newamon = new AMonitors(response,response1,dval);
										System.out.println(newamon);
										break;
							case "n": 	continue;
							}
							break;
					case 9: System.out.print(aps);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											aps.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											aps.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											aps.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											aps.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											aps.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										APowSupplies newaps = new APowSupplies(response,response1,dval);
										System.out.println(newaps);
										break;
							case "n": 	continue;
							}
							break;
					case 10:System.out.print(drvh);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											drvh.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											drvh.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											drvh.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											drvh.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											drvh.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										DRVH newdrvh = new DRVH(response,response1,dval);
										System.out.println(newdrvh);
										break;
							case "n": 	continue;
							}
							break;
					case 11:System.out.print(dvra);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											dvra.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											dvra.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											dvra.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											dvra.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											dvra.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										DVRA newdvra = new DVRA(response,response1,dval);
										System.out.println(newdvra);
										break;
							case "n": 	continue;
							}
							break;
					case 12:System.out.print(dvrd);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											dvrd.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											dvrd.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											dvrd.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											dvrd.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											dvrd.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										DVRD newdvrd = new DVRD(response,response1,dval);
										System.out.println(newdvrd);
										break;
							case "n": 	continue;
							}
							break;
					case 13:System.out.print(scama);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											scama.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											scama.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											scama.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											scama.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											scama.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										SCamA newscama = new SCamA(response,response1,dval);
										System.out.println(newscama);
										break;
							case "n": 	continue;
							}
							break;
					case 14:System.out.print(scamd);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											scamd.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											scamd.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											scamd.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											scamd.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											scamd.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										SCamD newscamd = new SCamD(response,response1,dval);
										System.out.println(newscamd);
										break;
							case "n": 	continue;
							}
							break;
					case 15:System.out.print(scamip);
							System.out.println("\nPlease select an operation (u for update, d for delete, a for add "
									+ "or n to return to the main menu)");
							response = input.next();
							switch (response){
							case "u":	System.out.println("Please enter value to be updated (n for name, d for description "
								+ "p for price, s for stock)");
								response = input.next();
								switch (response){
								case "n":	System.out.println("Please enter new value");
											response = input.next();
											scamip.setName(response);
											System.out.println("Name changed to " + response);
											break;
								case "d":	System.out.println("Please enter new value");
											response = input.next();
											scamip.setDesc(response);
											System.out.println("Description changed to " + response);
											break;
								case "p":	System.out.println("Please enter new value");
											dval = input.nextDouble();
											scamip.setPrice(dval);
											System.out.println("Price changed to " + dval);
											break;
								case "s":	System.out.println("Please enter new value");
											dub = input.nextInt();
											scamip.setName(response);
											System.out.println("Stock changed to " + dub);
											break;
										}
										break;
							case "d":	
										System.out.println("Are you sure you want to delete this item? y/n");
										response = input.next();
										if (response.equals("y")){
											scamip.setStock(0);
										}else{continue;};
										break;
							case "a": 	System.out.println("Enter name");
										response = input.next();
										System.out.println("Enter description");
										response1 = input.next();
										System.out.println("Enter price");
										dval = input.nextDouble();
										SCamIP newscamip = new SCamIP(response,response1,dval);
										System.out.println(newscamip);
										break;
							case "n": 	continue;
							}
							break;
					default:System.out.print("Invalid input");
							break;
					}
				//end crud
					System.out.println("Perform another operation? y/n");
					response = input.next();
					if (response.equals("n")){
						System.out.println("session ended");
						x = false;
					}
			}
			}
		}
		
		while(x==true){	
			
			System.out.print("###Inventory###");
			System.out.print("#1\n" + abrackets + "\n\n");
			System.out.print("#2\n" + acables + "\n\n");
			System.out.print("#3\n" + hc + "\n\n");
			System.out.print("#4\n" + ah + "\n\n");
			System.out.print("#5\n" + airl + "\n\n");
			System.out.print("#6\n" + al + "\n\n");
			System.out.print("#7\n" + am + "\n\n");
			System.out.print("#8\n" + amon + "\n\n");
			System.out.print("#9\n" + aps + "\n\n");
			System.out.print("#10\n" + drvh + "\n\n");
			System.out.print("#11\n" + dvra + "\n\n");
			System.out.print("#12\n" + dvrd + "\n\n");
			System.out.print("#13\n" + scama + "\n\n");
			System.out.print("#14\n" + scamd + "\n\n");
			System.out.print("#15\n" + scamip + "\n\n");
			
			System.out.println("Please select any desired items by #");
			dub = input.nextInt();
			
			switch (dub){
			case 1: System.out.print(abrackets);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(abrackets.getName());
						yDesc.add(abrackets.getDesc());
						yPrice.add(abrackets.getPrice());
						p.add(abrackets);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 2: System.out.print(acables);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(acables.getName());
						yDesc.add(acables.getDesc());
						yPrice.add(acables.getPrice());
						p.add(acables);
						System.out.println("\n\nItem added to cart\n");
					}
					break;
			case 3: System.out.print(hc);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(hc.getName());
						yDesc.add(hc.getDesc());
						yPrice.add(hc.getPrice());
						p.add(hc);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 4: System.out.print(ah);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(ah.getName());
						yDesc.add(ah.getDesc());
						yPrice.add(ah.getPrice());
						p.add(ah);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 5: System.out.print(airl);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(airl.getName());
						yDesc.add(airl.getDesc());
						yPrice.add(airl.getPrice());
						p.add(airl);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 6: System.out.print(al);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(al.getName());
						yDesc.add(al.getDesc());
						yPrice.add(al.getPrice());
						p.add(al);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 7: System.out.print(am);
					System.out.println("\n\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(am.getName());
						yDesc.add(am.getDesc());
						yPrice.add(am.getPrice());
						p.add(am);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 8: System.out.print(amon);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(amon.getName());
						yDesc.add(amon.getDesc());
						yPrice.add(amon.getPrice());
						p.add(amon);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 9: System.out.print(aps);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(aps.getName());
						yDesc.add(aps.getDesc());
						yPrice.add(aps.getPrice());
						p.add(aps);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 10:System.out.print(drvh);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(drvh.getName());
						yDesc.add(drvh.getDesc());
						yPrice.add(drvh.getPrice());
						p.add(drvh);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 11:System.out.print(dvra);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(dvra.getName());
						yDesc.add(dvra.getDesc());
						yPrice.add(dvra.getPrice());
						p.add(dvra);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 12:System.out.print(dvrd);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(dvrd.getName());
						yDesc.add(dvrd.getDesc());
						yPrice.add(dvrd.getPrice());
						p.add(dvrd);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 13:System.out.print(scama);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(scama.getName());
						yDesc.add(scama.getDesc());
						yPrice.add(scama.getPrice());
						p.add(scama);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 14:System.out.print(scamd);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(scamd.getName());
						yDesc.add(scamd.getDesc());
						yPrice.add(scamd.getPrice());
						p.add(scamd);
						System.out.println("\nItem added to cart\n");
					}
					break;
			case 15:System.out.print(scamip);
					System.out.println("\nAdd this item to cart? y/n");
					response = input.next();
					if(response.equals("y")){
						y.add(scamip.getName());
						yDesc.add(scamip.getDesc());
						yPrice.add(scamip.getPrice());
						p.add(scamip);
						System.out.println("\nItem added to cart\n");
					}
					break;
			default:System.out.print("Invalid input\n");
					break;
			}
			
			System.out.println("Checkout? y/n");
			response = input.next();
			if(response.equals("y")){
				for (double d : yPrice){
					total = total + d;
				}
				System.out.print("Total: " + total + "\n\n");
				System.out.println("Please enter your credit card information or type 'n' to continue shopping");
				dval = input.nextDouble();
				if (response.equals("n")){
					continue;
				}else{
					card = dval;
					System.out.println("Please enter your address or type 'n' to continue shopping");
					response = input.nextLine();
					response1 = input.nextLine();
					if (response.equals("n")){
						continue;
					}else{
						address = response1;
						Account account = new Account(address,card);
						System.out.println("###Order Summary###");
						for (int i = 0; i < y.size(); i++){
							int j = i+1;
							System.out.println("Item " + j);
							System.out.print(y.get(i) + "\n");
							System.out.print(yDesc.get(i) + "\n");
							System.out.print("$" + yPrice.get(i) + "\n");
							System.out.print("\n");
						}
						System.out.print("Shipping to: " + account.getAddress());
						System.out.print("\n");
						System.out.println("Total: " + "$" + total);
						System.out.println("\nSubmit order? y/n");
						response = input.next();
						if(response.equals("y")){
							Order order = new Order(total);
							
							for (Product product : p){
								product.stockDecreased();
							}
							System.out.println("Order Placed");
							System.out.println("Id: " + order.getId());
							System.out.println("Date: " + order.getTimestamp());
							System.out.println("Total: " + "$" + order.getTotal() + "\n");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else{
							break;
						}
					}
				}
			}
			
			System.out.println("Continue shopping? y/n");
			response = input.next();
			if(response.equals("n")){
				System.out.println("Have a nice day, please come again");
				x=false;
			}
		}

	}

}