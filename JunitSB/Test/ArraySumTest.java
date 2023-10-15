import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArraySumTest {

	ArraySum a = new ArraySum();
	//	int[] n1 = new int[] { 1, 2, 3 };

	@Test
	void SumArray() {
		//fail("Not yet implemented");
		int res = a.calculateSum(new int[] { 1, 2, 3 });

		//System.out.println(res);
		assertEquals(6, res); //expected will be left and actual will be on right hand side

	}

	@Test
	void SumArrayZero() {
		//fail("Not yet implemented");
		//	int res = 

		//System.out.println(res);
		assertEquals(1, a.calculateSum(new int[] {})); //expected will be left and actual will be on right hand side

	}

	/*
	 Test Annotations:
	 -> @Test
	  -> @BeforeAll
	   -> @AfterAll
	    -> @BeforeEach
	     -> @AfterEach
	 
	/*
	-> junit is to find bugs
	-> mockito is used when we have multiple dependencies
	
	 
	 */

}
