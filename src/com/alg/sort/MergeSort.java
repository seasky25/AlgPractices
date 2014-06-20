package com.alg.sort;

public class MergeSort implements Sort{

	@Override
	public int[] sort(int[] input) {
		int len = input.length;
		int[] temp = new int[len];
		sortInternal(input, temp, 0, len-1);
		return input;
	}

	private void sortInternal(int[] input, int[] temp, int i, int j) {
		if(j>i){
			int m = (i+j)/2;
			sortInternal(input, temp, i, m);
			sortInternal(input, temp, m+1, j);
			merge(input, temp, i, j, m);
		}
	}

	private void merge(int[] input, int[] temp, int i, int j, int m) {
		copy(input, temp, i, j);
		int a = i;
		int b = m+1;
		int c = i;
		while(c<=j){
			if(a<=m&&b>j)
				input[c++] = temp[a++];
			else if(a>m&&b<=j)
				input[c++] = temp[b++];
			else if(temp[a]<=temp[b])
				input[c++] = temp[a++];
			else
				input[c++] = temp[b++];
		}
	}

	private void copy(int[] input, int[] temp, int i, int j) {
		for(int c = i; c<=j; c++){
			temp[c] = input[c];
		}
	}

}
