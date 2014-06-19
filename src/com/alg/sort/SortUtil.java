package com.alg.sort;

import java.util.Random;

public class SortUtil {
	final static int SIZE = 50; //size of the array
	final static int SCOPE = 1000; //max of the random number
	public static int[] generateRandomArray(int len, int edge){
		Random rand = new Random();
		
		int[] output = new int[len];
		for(int i = 0; i < len; i++){
			output[i] = rand.nextInt(edge);
			if(rand.nextBoolean()) output[i] = 0 - output[i];
		}
		return output;
	}
	
	public static int[] generateRandomArray(){
		return generateRandomArray(SIZE,SCOPE);
	}
	
	public static void display(int[] input, int[] output){
		System.out.println("Here is the input array:");
		displayArray(input);
		System.out.println("Here is the output array:");
		displayArray(output);
	}
	
	private static void displayArray(int[] arr){
		int len = arr.length;
		if(len>0){
			System.out.print("{");
			for(int i =0; i<len-1; i++){
				System.out.print(arr[i]+", ");
			}
			System.out.println(arr[len-1]+"}");
		}else
			System.out.println("Empty Array!");

	}
}
