/**
 * 
 */
package com.sebone.excr.numeric.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.excr.numeric.FindFactorialOfNumber;

/**
 * @author Bhawna Rathor
 *
 */
public class FindFactorialOfNumberTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sebone.excr.numeric.FindFactorialOfNumber#findFactorial(int)}.
	 */
	@Test
	public void testFindFactorial() {
		FindFactorialOfNumber findFactorialOfNumber=new FindFactorialOfNumber();
		assertEquals(120, findFactorialOfNumber.findFactorial(5));
	}

}
