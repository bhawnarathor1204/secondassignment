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

import com.sebone.excr.numeric.CountNumberOfDigits;

/**
 * @author Bhawna Rathor
 *
 */
public class CountNumberOfDigitsTest {

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
	 * Test method for {@link com.sebone.excr.numeric.CountNumberOfDigits#countDigit(int)}.
	 */
	@Test
	public void testCountDigit() {
		CountNumberOfDigits countNumberOfDigits=new CountNumberOfDigits();
		assertEquals(4,countNumberOfDigits.countDigit(1234));
	}

}
