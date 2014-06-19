package com.alg.sort.test;

import org.junit.Test;

import com.alg.sort.MergeSort;

public class MergeSortTest extends SortBaseTest {
	private MergeSort sort = new MergeSort(); 

	@Test
	public void testSort(){
		int[] input = SortTestingUtil.generateRandomArray();
		int[] output = sort.sort(input);
		verifyArraySeq(input, output, isDisplay());
	}
}
