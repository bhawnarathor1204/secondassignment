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

import com.sebone.excr.numeric.SumOfOneToNNumbers;

/**
 * @author Bhawna Rathor
 *
 */
public class SumOfOneToNNumbersTest {

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
	 * Test method for {@link com.sebone.excr.numeric.SumOfOneToNNumbers#calculateSumOfOneTONNumber(int)}.
	 */
	@Test
	public void testCalculateSumOfOneTONNumber() {
		SumOfOneToNNumbers sumOfOneToNNumbers=new SumOfOneToNNumbers();
		assertEquals(15,sumOfOneToNNumbers.calculateSumOfOneTONNumber(5));
		
	}

}
