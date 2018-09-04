package com.mathjava.learn;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CalculatorTest {
	
	private Calculator classunderTest;

	@BeforeEach
	void setUp() throws Exception {
		
		classunderTest = new Calculator();
	}
	
	
	@Test
	void testGradient() {
		//testing only double type of data, hence no decimal 
		double result;
		
		//test 1
		result = (20-10)/(5-3); //brute test
		//test the calculator class 
	    assertEquals(result,classunderTest.gradient(20,10,5,3),0.001);	

		
		//test 2 
		result = (-20-10)/(5-0); //brute test 
		assertEquals("should pass", result, classunderTest.gradient(-20,10,5,0),0.001);
		
//		//test 2 
				result = (12.1-10.4)/(5-0); //brute test 
				assertEquals(result, classunderTest.gradient(12.1,10.4,5,0),0.001);

//		//test 3
//		result = (1-0)/(0-0); //brute test 		
//		try {
//			assertEquals( result,  classunderTest.gradient(1,0,0,0), 0.001); // exception should occur
//
//			assertTrue(false); // should not execute this
//			}
//			catch (ArithmeticException e) {
//			// exception is expected
//			assertTrue(e.toString().contains("Infinite Slope"));
//			}									
	}
	
	
//	@Test
//	public void testExceptionMessage() {
//	    try {
//	        double result = (1-0)/(0-0);
//	        fail("Expected an IndexOutOfBoundsException to be thrown");
//	    } catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
//	        assertThat(anIndexOutOfBoundsException.getMessage(),("infinity"));
//	    }
//	}
	
	
//	@Test (expected = IllegalArgumentException.class)
//	public void throwsExceptionWhenNegativeNumbersAreGiven() {
//	    // act
//	    result = (1-0)/(0-0);
//	}
	
//	
//	@Test
	public void whenDerivedExceptionThrown_thenAssertionSucceds() {
		
	    assertThrows(RuntimeException.class, () -> {
	    	double result = (1-0)/(0-0);
	    });
	}
	
	@Test
	void testEquation() {
		
		
//        double result = mx+c 
		
	double	gradient = (20-10)/(5-3);
		
double c = 10 - gradient * 3;
		
		String result="y="+gradient+"x"+c;
		
		assertEquals(result, classunderTest.equation(20,10,5,3));
		
		
		 double gradient2 =(double)(3-2)/(2-1);
		System.out.println(gradient2);
		
		 c = 2 - gradient2 * 1;
				
				result="y="+gradient2+"x+"+c;
				
				assertEquals(result, classunderTest.equation(3,2,2,1));
				
	
	}

	@Test
	void testDistance() {
		
		//test 1
		double result;
		
		//distance is default double
		
		result=Math.sqrt((5-4)*(5-4) + (-12-0)*(-12-0));
		//test the calculator class 
		assertEquals(result, classunderTest.distance(5,4,-12,0),0.001);	
	}

}
