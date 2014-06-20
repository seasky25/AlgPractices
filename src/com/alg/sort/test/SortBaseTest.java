package com.alg.sort.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import com.alg.sort.Sort;

public abstract class SortBaseTest {
	//show debug info
	private boolean debug = true;
	public SortBaseTest() {
		super();
	}

	private void verifyArraySeq(int[] input, int[] output, boolean display) {
		assertNotNull("input is null", input);
		assertNotNull("output is null", output);
		if(display) SortTestingUtil.display(input, output);
		boolean asc = true;
		int i = 0;
		while(i<output.length-1){
			if(output[i]>output[i+1]){
				asc = false;
				break;
			}
			i++;
		}
		assertTrue("Output array not in ascending order", asc);
	}
	
	protected void testSort(Sort sort){
		int[] input = SortTestingUtil.generateRandomArray();
		int[] output = sort.sort(Arrays.copyOf(input, input.length));
		verifyArraySeq(input, output, isDisplay());
	}
	
	protected boolean isDisplay(){
		return debug;
	}


}