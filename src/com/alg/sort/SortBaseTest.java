package com.alg.sort;

import static org.junit.Assert.assertTrue;

public class SortBaseTest {
	private boolean debug = true;
	public SortBaseTest() {
		super();
	}

	protected void verifyArraySeq(int[] input, int[] output, boolean display) {
		if(display) SortUtil.display(input, output);
		for(int i = 0; i<output.length-1; i++){
			assertTrue(output[i]<=output[i+1]);
		}
	}
	
	protected boolean isDisplay(){
		return debug;
	}


}