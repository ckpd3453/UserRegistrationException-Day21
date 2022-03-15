package bridgeLab;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Validate {
	
	
	/*
	 * Test Case for first name and also handling exception
	 */
	@Test
	public void test1() throws Exception {
		//getting boolean result by calling method of UserRegistration Class
		Boolean firstname = UserRegistration.fname("handra");
		//Getting Exception
		try {
			if (firstname == true) {
				//Running Test Case
				assertEquals(true, firstname);
			} else {
				//throwing exception 
				throw new Exception();
			}
			//Handling Exception
		} catch (Exception e) {
			System.out.println("Invalid First Name");
		}
	}

	/*
	 * Test Case for Last name and also handling exception
	 */
	@Test
	public void test2() {
		//getting boolean result by calling method of UserRegistration Class
		Boolean lastname = UserRegistration.lname("Prasad");
		//Getting Exception
		try {
			if (lastname == true) {
				//Running Test Case
				assertEquals(true, lastname);
			} else {
				//throwing exception 
				throw new Exception();
			}
			//Handling Exception
		} catch (Exception e) {
			System.out.println("Invalid Last Name");
		}
	}

	/*
	 * Test Case for email and also handling exception
	 */
	@Test
	public void test3() {
		//getting boolean result by calling method of UserRegistration Class
		Boolean email = UserRegistration.email("chandra53@bl.co.in");
		//Getting Exception
		try {
			if (email == true) {
				//Running Test Case
				assertEquals(true, email);
			} else {
				//throwing exception 
				throw new Exception();
			}
			//Handling Exception
		} catch (Exception e) {
			System.out.println("Invalid Email Id");
		}
	}

	/*
	 * Test Case for phone number and also handling exception
	 */
	@Test
	public void test4() {
		//getting boolean result by calling method of UserRegistration Class
		Boolean phone = UserRegistration.number("91 7001950699");
		//Getting Exception
		try {
			if (phone == true) {
				//Running Test Case
				assertEquals(true, phone);
			} else {
				//throwing exception 
				throw new Exception();
			}
			//Handling Exception
		} catch (Exception e) {
			System.out.println("Invalid Phone No.");
		}
	}

	/*
	 * Test Case for password and also handling exception
	 */
	@Test
	public void test5() {
		//getting boolean result by calling method of UserRegistration Class
		Boolean output = UserRegistration.password("Chandra@2453");
		//Getting Exception
		try {
			if (output == true) {
				//Running Test Case
				assertEquals(true, output);
			} else {
				//throwing exception 
				throw new Exception();
			}
			//Handling Exception
		} catch (Exception e) {
			System.out.println("Invalid Password");
		}
	}
}
