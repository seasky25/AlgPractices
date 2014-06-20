package com.alg.sort.test;

import org.junit.Test;

import com.alg.sort.BubbleSort;
import com.alg.sort.BucketSort;
import com.alg.sort.CombSort;
import com.alg.sort.CountingSort;
import com.alg.sort.HeapSort;
import com.alg.sort.InsertionSort;
import com.alg.sort.MergeSort;
import com.alg.sort.QuickSort;
import com.alg.sort.RadixSort;
import com.alg.sort.SelectionSort;
import com.alg.sort.ShellSort;

public class BasicSortTest extends SortBaseTest {

	@Test
	public void testMergeSort(){
		testSort(new MergeSort());
	}
	
	@Test
	public void testQuickSort(){
		testSort(new QuickSort());
	}
	
	@Test
	public void testBubbleSort(){
		testSort(new BubbleSort());
	}
	
	@Test
	public void testHeapSort(){
		testSort(new HeapSort());
	}
	
	@Test
	public void testInsertionSort(){
		testSort(new InsertionSort());
	}
	
	@Test
	public void testSelectionSort(){
		testSort(new SelectionSort());
	}
	
	@Test
	public void testShellSort(){
		testSort(new ShellSort());
	}
	
	
	@Test
	public void testCombSort(){
		testSort(new CombSort());
	}
	
	@Test
	public void testCountingSort(){
		testSort(new CountingSort());
	}
	
	@Test
	public void testBucketSort(){
		testSort(new BucketSort());
	}
	
	@Test
	public void testRadixSort(){
		testSort(new RadixSort());
	}
}
