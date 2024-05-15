package com.srfreed.eightlight;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class CodingChallengeTest {

	@Test
	public void test1() {	
		String one = CodingChallenge.filterNonNumericVals("7-623");
		String two = CodingChallenge.filterNonNumericVals("..2965a");
		
		assertTrue(one.equals("7623"));
		assertTrue(two.equals("2965"));
	}
	
	@Test
	public void test2() {
		String[] array1 = new String[]{"a", "b", "c", "a", "b", "d"};
		Integer[] array2 = new Integer[] {4, 4, 3, 2, 3, 1};
		
		
		String[] one = CodingChallenge.removeDuplicatesFromArray(array1);
		Integer[] two = CodingChallenge.removeDuplicatesFromArray(array2);
		
		String[] array1Answer = new String[]{"a", "b", "c", "d"};
		Integer[] array2Answer = new Integer[] {4, 3, 2, 1};

		
		assertTrue(Arrays.equals(one,array1Answer));
		assertTrue(Arrays.equals(two, array2Answer));
	}
	
	@Test
	public void test3() {
		String[] array1 = new String[]{"7-623", "8235", "8-235"};
		
		
		String[] one = CodingChallenge.getSpecialties(array1);
		
		String[] array1Answer = new String[]{"security", "data engineering"};

		
		assertTrue(Arrays.equals(one,array1Answer));
	}
}
