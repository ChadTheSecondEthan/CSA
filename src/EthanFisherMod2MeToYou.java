/*
 * Author: Ethan Fisher
 * Date: 8/17/2020
 * School: Franklin Academy HS
 * Hello World Program
 * 
 * Description: Prints a message with extra lines
 * Difficulties: I didn't always place enough line breaks
 * Learned: You can add strings to each other
 */

public class EthanFisherMod2MeToYou {

	public static void main(String[] args) {
		
		// variables for sender, address, data, recipient, and message
		String sender, address, date, recipient, message;
		sender = "From: Bill Smith";
		address = "Address: Dell Computer, Bldg 13";
		date = "Date: April 12, 2005";
		recipient = "To: Jack Jones";
		message = "Message: Help! I'm trapped inside a computer!";
	
		System.out.println(sender + "\n" + address + "\n" + date + "\n\n" + recipient + "\n\n" + message);
	}

}

/*
 * Sample Output:
 * 
 * From: Bill Smith
 * Address: Dell Computer, Bldg 13
 * Date: April 12, 2005
 * 
 * To: Jack Jones
 * 
 * Message: Help! I'm trapped inside a computer!
 */