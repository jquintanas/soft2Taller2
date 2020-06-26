package labcodeinspection;

/**
* @author Fran
*/
public class Email {
	
	/**
	* @author franManGing
	*/
	private  String mfirstName; //NOPMD
	/**
	* @author franManGing
	*/
	private  String mlastName;//NOPMD
	/**
	* @author franManGing
	*/
	private  String department; //NOPMD
	/**
	* @author franManGing
	*/
	private  String mail; //NOPMD
	/**
	* @author franManGing
	*/
	private  String password;//NOPMD
	  
	/**
	* @author Fran
	*/
	private static int defPassLength = 8;

	/**
	* @author Fran
	*/
	public Email(final String firstName, final String lastName) {
		this.mfirstName = firstName;
		this.mlastName = lastName;
	}

	/**
	* @author Fran
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + mfirstName + "\nLAST NAME= " + mlastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + mail + "\nPASSWORD= " + password);
	}

	/**
	* @author Fran
	*/
	public void setDeparment(int depChoice) { // NOPMD 
		
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
	        // unknown type! based on the language,
	        // there should probably be some error-handling
	        // here, maybe an exception
		}
	}

	
	private String randomPassword( int length) { // NOPMD 
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*"; // NOPMD 
		char[] password = new char[length]; // NOPMD 
		
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand); // NOPMD 
		}
		return new String(password);
	}

	/**
	*
	*
	* @author FranMan Ging
	*/
	public void generateEmail() { // NOPMD
		this.password = this.randomPassword(Email.defPassLength);
		this.mail = this.mfirstName.toLowerCase() + this.mlastName.toLowerCase() + "@" + this.department // NOPMD 
				+ ".espol.edu.ec";
	}
}
