package com.alg.sort.test;

import static org.junit.Assert.assertTrue;

public abstract class SortBaseTest {
	private boolean debug = true;
	public SortBaseTest() {
		super();
	}

	protected void verifyArraySeq(int[] input, int[] output, boolean display) {
		if(display) SortTestingUtil.display(input, output);
		for(int i = 0; i<output.length-1; i++){
			assertTrue(output[i]<=output[i+1]);
		}
	}
	
	protected boolean isDisplay(){
		return debug;
	}


}