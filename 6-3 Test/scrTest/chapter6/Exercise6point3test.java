package chapter6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;

/*
 * assertEquals(arg1,arg2)  - will take 2 arguments and return T or F
 * 							- usually 1 arguments will be expected to answer while other is result from function
 * 
 * assertTrue(arg)  - return T or F
 * 					- used for methods that return a boolean 
 * 
 * Fail(error)  - may use if 
 */

import org.junit.Test;

public class Exercise6point3test {
	
	//runs before anything else
	//necessary for when testing Objects 
	//this time can use public for @Before and @After
	
	@Before
	public void seUp() throws Exception{
		System.out.println("Set up testing");	
	}
	
	@Test
	public void testReverse() {
		//test the case 3456
		assertEquals(6543, Exercise6point3.reverse(3456));
		if (6543 == Exercise6point3.reverse(3456)) {
			System.out.println("Reverse function is correct.");
		}
		else {
			System.out.println("Reverse Function is a failure.");
		}
	}

	public void testIsPalindrome() {
		assertTrue(Exercise6point3.isPalindrome(456));
	}
	
	
	//also used with Objects
	@After
	public void tearDown() throws Exception{
		System.out.println("Tear down testing");
	}
}






/*

The following methods can be used to implement a test method:

assertTrue(booleanExpression): The method reports success if the booleanExpression evaluates true.

assertEquals(Object, Object): The method reports success if the two objects are the same using the
equals method.

assertNull(Object): The method reports success if the object reference passed is null.

fail(String): The method causes the test to fail and prints out the string. 

*/
