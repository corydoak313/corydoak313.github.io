package contact;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {
	
	//Array list of contacts
	private List<ContactClass> contacts = new ArrayList<>();
	
		//create unique ID with no more than 10 characters
		String uniqueId = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
		
		//Error message for checking ID existence.
		String idError = "This ID does not exist.";

	//Add Contact- check if contact exists, if not then add, 
	//	if already a contact, then outputs that it already exists. 
	public boolean addContact(String uniqueId) throws Exception{
		
		for (ContactClass contactList: contacts) {
				//check if ID does not exist and throw an exception and add contact
				if(contactList.getId() != null && !contactList.getId().equals(uniqueId) ){
					throw new Exception(idError);
				}
				contacts.add(contactList);			
									
			}
		return true;
		}
		
	
	
	//Delete Contact- Finding contact by uniqueId and deleting, otherwise
	//throws exception
	public boolean deleteContact(String uniqueId) throws Exception{
		for(ContactClass contactList : contacts) {
			if(!contactList.getId().equals(uniqueId) || contactList.getId() == null) {
				throw new Exception(idError);
			}
			else{
				contacts.remove(contactList);
				return true;
			}
		}
		return false;
	}
	
	
	//Updating first name- finding contact by uniqueId and updating first name otherwise, 
	//throws exception
	public boolean updateFirstName(String uniqueId, String firstName) throws Exception{
		for(ContactClass contactList: contacts) {
			if(contactList.getId() == null || !contactList.getId().equals(uniqueId)) {
				throw new Exception(idError);
			}
			//if firstName is longer than 10 character, throw exception
			if(firstName.length() > 10) {
				throw new Exception("First Name is too long.");
			}
			else{
				contactList.getFirstName();
			}
		}
		return false;
	}
	
	//Updating LastName- finding contact by uniqueId and updating last name, otherwise
	//throws exception
	public boolean updateLastName(String uniqueId, String lastName) throws Exception {
		for(ContactClass contactList: contacts) {
			if(contactList.getId() == null || !contactList.getId().equals(uniqueId)) {
				throw new Exception(idError);
			}
			//if lastName is longer than 10 characters, throw exception
			if(lastName.length() > 10) {
				throw new Exception("Last Name is too long.");
					
			}
			else{
				contactList.getLastName();
			}
		}
		return false;
	}
	
	//Updating Phone- finding contact by uniqueId and updating phone number otherwise 
	//throw an exception
	public boolean updatePhone(String uniqueId, String phone) throws Exception {
		for(ContactClass contactList: contacts) {

			if(contactList.getId() == null || !contactList.getId().equals(uniqueId)) {

				throw new Exception(idError);
			}
			//if phone number is not 10 digits, then throw an exception
			if(phone.length() != 10) {

				throw new Exception("Phone number needs to be 10 digits.");
			}
			//get phone number
			else {
				contactList.getPhone();
			}
		}
		
		return false;
	}
	

	//Updating Address- finding contact by uniqueId and updating address.
	public boolean updateAddress(String uniqueId, String address) throws Exception {
		for(ContactClass contactList: contacts) {

			//Find by ID otherwise throw exception
			if(contactList.getId() == null || !contactList.getId().equals(uniqueId)) {
				throw new Exception(idError);
			}
			//Address needs to be 30 characters or less otherwise throw an exception
			if(address.length() > 30) {

				throw new Exception("This Address is too long.");
			}
			//get address
			else {
				contactList.getAddress();				
			}
		}
		return false;
	}
	
}
	


