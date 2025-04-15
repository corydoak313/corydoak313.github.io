package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import contact.ContactClass;
import contact.ContactService;

public class ContactServiceTest {

	@Test
	public void testAdd() {
		ContactService cs = new ContactService();
		
		ContactClass test1 = new ContactClass("John", "Hammond", "5555555555", "123 Rd.", "1234567890");
		assertEquals(true, cs.addContact(test1));
	}
	
	@Test
	public void testDelete() { 
		ContactService cs = new ContactService();
		
		//contact id is 1234567890
		ContactClass test1 = new ContactClass("John", "Hammond", "5555555555", "123 Rd.", "1234567890");
		//contact id is 2234567890
		ContactClass test2 = new ContactClass("Jane", "Smith", "1112223333", "222 Rd.", "2234567890");
		//contact id is 3334567890
		ContactClass test3 = new ContactClass("Alan", "Grant", "1234567890", "333 Rd", "3334567890");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.deleteContact("1234567890"));
		assertEquals(true, cs.deleteContact("2234567890"));
		assertEquals(true, cs.deleteContact("3334567890"));
	}
	
	@Test
	public void testUpdateFirstName() {
		ContactService cs = new ContactService();
		
		//ContactId is 1111117
		ContactClass test1 = new ContactClass("John", "Hammond", "5555555555", "123 Rd.", "1111117");
		//ContactId is 2222227
		ContactClass test2 = new ContactClass("Jane", "Smith", "1112223333", "222 Rd.", "2222227");
		//ContactId is 3333337
		ContactClass test3 = new ContactClass("Alan", "Grant", "1234567890", "333 Rd.", "3333337");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(false, cs.updateFirstName("1111117", "New Name"));
		assertEquals(false, cs.updateFirstName("3333337", "Jane New"));
		assertEquals(false, cs.updateFirstName("3333367", "NewJohn"));
	
	}
	
	@Test
	public void testUpdateLastName() {
		ContactService cs = new ContactService();
		
		//ContactId is 1111117
		ContactClass test1 = new ContactClass("John", "Hammond", "5555555555", "123 Rd.", "1111117");
		//ContactId is 2222227
		ContactClass test2 = new ContactClass("Jane", "Smith", "1112223333", "222 Rd.", "2222227");
		//ContactId is 3333337
		ContactClass test3 = new ContactClass("Alan", "Grant", "1234567890", "333 Rd.", "3333337");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.updateLastName("1111117", "New Hammond"));
		assertEquals(true, cs.updateLastName("3333337", "Smithson"));
		assertEquals(false, cs.updateLastName("3333367", "Granted"));
	
	}
	
	@Test
	public void testUpdatePhone() {
		ContactService cs = new ContactService();
		
		//ContactId is 1111117
		ContactClass test1 = new ContactClass("John", "Hammond", "5555555555", "123 Rd.", "1111117");
		//ContactId is 2222227
		ContactClass test2 = new ContactClass("Jane", "Smith", "1112223333", "222 Rd.", "2222227");
		//ContactId is 3333337
		ContactClass test3 = new ContactClass("Alan", "Grant", "1234567890", "333 Rd.", "3333337");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.updatePhone("1111117", "4444444444"));
		assertEquals(true, cs.updatePhone("3333337", "6666666666"));
		assertEquals(false, cs.updatePhone("3333367", "7777777777"));
	
	}
	
	@Test
	public void testUpdateAddress() {
		ContactService cs = new ContactService();
		
		//ContactId is 1111117
		ContactClass test1 = new ContactClass("John", "Hammond", "5555555555", "123 Rd.", "1111117");
		//ContactId is 2222227
		ContactClass test2 = new ContactClass("Jane", "Smith", "1112223333", "222 Rd.", "2222227");
		//ContactId is 3333337
		ContactClass test3 = new ContactClass("Alan", "Grant", "1234567890", "333 Rd.", "3333337");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.updateAddress("1111117", "111 Dr."));
		assertEquals(true, cs.updateAddress("3333337", "222 Ave."));
		assertEquals(false, cs.updateAddress("3333367", "333 Cir."));
	
	}

}
