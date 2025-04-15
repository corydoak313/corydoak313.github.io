package contact;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {
	
	//Arrasy list of contacts
	private List<ContactClass> contacts = new ArrayList<>();
	
		//create unique ID with no more than 10 characters
	
		String uniqueId = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
	
	//Add Contact- check if contact exists, if not then add, 
	//	if already a contact, then outputs that it already exists. 
	public boolean addContact(ContactClass test1){
		boolean alreadyContact = false;
		
		for (ContactClass contactList: contacts) {
			if(contactList.getId().equals(test1)) {
				alreadyContact = true;
				System.out.println("Contact already exists.");
			}
		}
		if(!alreadyContact) {
			contacts.add(test1);
			
			return true;
		}
		else {
			return false;
		}
	}
	//Delete Contact- Finding contact by uniqueId and deleting
	public boolean deleteContact(String uniqueId) {
		for(ContactClass contactList : contacts) {
			if(contactList.getId().equals(uniqueId)) {
				contacts.remove(contactList);
				return true;
			}
			else {
			return false;
			}
		}
		return false;
	}
	
	//Updating first name- finding contact by uniqueId and updating first name
	public boolean updateFirstName(String uniqueId, String firstName) {
		for(ContactClass contactList: contacts) {
			if(contactList.getId().equals(uniqueId)) {
				if(firstName.length() > 10) {
					contactList.getFirstName();
				}
				return true;
			}
		}
		return false;
	}
	
	//Updating LastName- finding contact by uniqueId and updating last name
	public boolean updateLastName(String uniqueId, String lastName) {
		for(ContactClass contactList: contacts) {
			if(contactList.getId().equals(uniqueId)) {
				if(lastName.length() > 10) {
					contactList.getLastName();
				}
				return true;
			}
		}
		return false;
	}
	
	//Updating Phone- finding contact by uniqueId and updating phone number
	public boolean updatePhone(String uniqueId, String phone) {
		for(ContactClass contactList: contacts) {
			if(contactList.getId().equals(uniqueId)) {
				if(phone.length() > 10) {
					contactList.getPhone();
				}
				return true;
			}
		}
		return false;
	}

	//Updating Address- finding contact by uniqueId and updating address.
	public boolean updateAddress(String uniqueId, String address) {
		for(ContactClass contactList: contacts) {
			if(contactList.getId().equals(uniqueId)) {
				if(address.length() > 30) {
					contactList.getAddress();
				}
				return true;
			}
		}
		return false;
	}
}

