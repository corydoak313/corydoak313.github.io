package contact;

import java.util.ArrayList;

public class ContactService {
	
	private ArrayList<ContactClass> contacts;
	
	public ContactService() {
		
		contacts = new ArrayList<>();
	}
	//add contact
	public boolean addContact(ContactClass contact){
		boolean alreadyContact = false;
		
		for (ContactClass contactList: contacts) {
			if(contactList.equals(contact)) {
				alreadyContact = true;
			}
		}
		if(!alreadyContact) {
			contacts.add(contact);
			
			return true;
		}
		else {
			return false;
		}
	}
		
		public boolean deleteContact(String id) {
			for(ContactClass contactList : contacts) {
				if(contactList.getId().equals(id)) {
					contacts.remove(contactList);
					return true;
				}
				else {
				return false;
				}
			}
			return false;
		}
		
		//Updating first name
		public boolean updateFirstName(String id, String firstName) {
			for(ContactClass contactList: contacts) {
				if(contactList.getFirstName().equals(firstName)) {
					if(firstName.length() > 10) {
						contactList.getFirstName();
					}
					return true;
				}
			}
			return false;
		}
		
		//Updating LastName
		public boolean updateLastName(String id, String lastName) {
			for(ContactClass contactList: contacts) {
				if(contactList.getId().equals(id)) {
					if(lastName.length() > 10) {
						contactList.getLastName();
					}
					return true;
				}
			}
			return false;
		}
		
		//Updating Phone
		public boolean updatePhone(String id, String phone) {
			for(ContactClass contactList: contacts) {
				if(contactList.getId().equals(id)) {
					if(phone.length() > 10) {
						contactList.getPhone();
					}
					return true;
				}
			}
			return false;
		}

		//Updating Address
		public boolean updateAddress(String id, String address) {
			for(ContactClass contactList: contacts) {
				if(contactList.getId().equals(id)) {
					if(address.length() > 30) {
						contactList.getAddress();
					}
					return true;
				}
			}
			return false;
		}
}

