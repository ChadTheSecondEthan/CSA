package Module14;

public class Patron {
	
	// instance variables
	private String firstName;
	private String lastName;
	private String libNumber;
	private Media media;
	
	/**
	 * Default constructor
	 */
	public Patron() {
		firstName = null;
		lastName = null;
		libNumber = null;
		media = null;
	}
	
	/**
	 * Normal Constructor
	 */
	public Patron(String firstName, String lastName, String libNumber, Media media) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.libNumber = libNumber;
		this.media = media;
	}
	
	/******************************* Getters **************************/
	
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getLibraryNumber() { return libNumber; }
	public Media getMedia() { return media; }
	
	/******************************* Setters **************************/
	
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setLibNumber(String libNumber) { this.libNumber = libNumber; }
	public void setMedia(Media media) { this.media = media; }
	
	/**
	 * To String method
	 */
	public String toString() {
		String str = "The specs of this Patron is: ";
		str += "\n\t First Name: " + firstName;
		str += "\n\t Last Name: " + lastName;
		str += "\n\t Library Number: " + libNumber;
		str += "\n\t Media: " + media;
		return str;
	}

}
