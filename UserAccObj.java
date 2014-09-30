package tpvar.useracc;

public class UserAccObj {
	public String un = ""; // user name, every DB record has to have it
	public String pd = ""; // password, the received hash  	------------- non-DB
	public String st = ""; // stored salt
	public String hs = ""; // stored hash
	public String em; // primary id must have it, created during purchase time
	
	// ---------- THIS IS NOT ACCOUNT NUMBER
	public String id; //unique number id, every record has to have it ---------- primary key, auto-increase, 
	
	// ---------- THIS IS ACCOUNT NUMBER
	public String group_id; // unique group_id, but not every one has to have it; each member has different id, but 
							// same group_id, group id for master account is "G" + id
	
	public boolean is_pri; // is the account primary or master account, which must has un, email, id, is_primary == true, and a group id.
	
	// profile part when first time log in need to handle
	public String fn = "";  // first name
	
	
	
	public UserAccObj () {
		
	}
	
	public UserAccObj (String em, String st, String hs) {
		this.un = em;
		this.st = st;
		this.hs = hs;
	}
	
	public String toString () {
		
		return ("Un: " + un + " Pd: " + pd + " St: " + st + " Hs: " + hs);
					
	}

	
}