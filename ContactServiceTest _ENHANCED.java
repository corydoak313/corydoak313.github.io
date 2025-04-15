package test;

import org.junit.Test;
import static org.junit.Assert.*;

import contact.ContactClass;
import contact.ContactService;

public class ContactServiceTest {
	// contact id is 1234567890
	public static final ContactClass TEST1 = new ContactClass("John", "Hammond", "5555555555", "123 Rd.", "1234567890");
	// contact id is 2234567890
	public static final ContactClass TEST2 = new ContactClass("Jane", "Smith", "1112223333", "222 Rd.", "2234567890");
	// contact id is 3334567890
	public static final ContactClass TEST3 = new ContactClass("Alan", "Grant", "0000000000", "333 Rd", "3334567890");

	//Testing to add a new contact
	@Test
	public void testAdd() throws Exception {
		ContactService cs = new ContactService();

		cs.addContact(ContactClass.TEST1);
		cs.addContact(ContactClass.TEST2);
		cs.addContact(ContactClass.TEST3);

		assertEquals(true, cs.addContact("1234567890"));
		assertEquals(true, cs.addContact("2234567890"));
		assertEquals(true, cs.addContact("01234567890"));
	}

	//Testing to delete a contact
	@Test
	public void testDelete() throws Exception {
		ContactService cs = new ContactService();

		cs.deleteContact(ContactClass.TEST1);
		cs.deleteContact(ContactClass.TEST2);
		cs.deleteContact(ContactClass.TEST3);

		assertEquals(true, cs.deleteContact("11234567890"));
		assertEquals(true, cs.deleteContact("2234567890"));
		assertEquals(true, cs.deleteContact("3334567890"));
	}

	//Testing to update first name
	@Test
	public void testUpdateFirstName() throws Exception {

		ContactService cs = new ContactService();
		 
		cs.updateFirstName(ContactClass.TEST1, "NewJohn");
		cs.updateFirstName(ContactClass.TEST2, "NewJane");
		cs.updateFirstName(ContactClass.TEST3, "NewAlan");

		assertEquals(true, cs.updateFirstName("1234567890", "Name is too long"));
		assertEquals(true, cs.updateFirstName("2234567890", "NewJane"));
		assertEquals(true, cs.updateFirstName("3334567890", "NewAlan"));

	}

	//Testing to update last name
	@Test
	public void testUpdateLastName() throws Exception {
		ContactService cs = new ContactService();

		cs.updateLastName(ContactClass.TEST1, "NewHammond");
		cs.updateLastName(ContactClass.TEST2, "NewSmith");
		cs.updateLastName(ContactClass.TEST3, "NewGrant");
		
		assertEquals(true, cs.updateLastName("1234567890", "Last Name is too long"));
		assertEquals(true, cs.updateLastName("2234567890", "NewJane"));
		assertEquals(true, cs.updateLastName("3334567890", "NewGrant"));


	}

	//Testing to update Phone Number
	@Test
	public void testUpdatePhone() throws Exception {
		ContactService cs = new ContactService();

		
		cs.updatePhone(ContactClass.TEST1, "111222333444555");
		cs.updatePhone(ContactClass.TEST2, "2234567890");
		cs.updatePhone(ContactClass.TEST3, "0000000001");

		assertEquals(true, cs.updatePhone("1234567890", "111222333444555"));
		assertEquals(true, cs.updatePhone("2234567890", "2234567890"));
		assertEquals(true, cs.updatePhone("3334567890", "0000000001"));

	}

	//Testing to update Address
	@Test
	public void testUpdateAddress() throws Exception {
		ContactService cs = new ContactService();

		cs.addContact(ContactClass.TEST1);
		cs.addContact(ContactClass.TEST2);
		cs.addContact(ContactClass.TEST3);

		assertEquals(false, cs.updateAddress("1234567890", "111 Dr."));
		assertEquals(false, cs.updateAddress("3333337", "222 Ave."));
		assertEquals(false, cs.updateAddress("3333367", "333 Cir."));

	}

}
