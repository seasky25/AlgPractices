package com.alg.sort;

import org.junit.Test;

public class MergeSortTest extends SortBaseTest {
	private MergeSort sort = new MergeSort(); 

	@Test
	public void testSort(){
		int[] input = SortUtil.generateRandomArray();
		int[] output = sort.sort(input);
		verifyArraySeq(input, output, isDisplay());
	}
}
