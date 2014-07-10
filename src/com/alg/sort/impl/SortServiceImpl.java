package com.alg.sort.impl;

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
import com.alg.sort.Sort;
import com.alg.sort.api.SortService;
import com.alg.sort.api.SortType;

public class SortServiceImpl implements SortService {

	@Override
	public int[] sort(int[] input, SortType st) {
		return getSort(st).sort(input);
	}

	private Sort getSort(SortType st) {
		Sort s;
		switch (st) {
		case BUBBLE:
			s = new BubbleSort();
			break;
		case BUCKET:
			s = new BucketSort();
			break;
		case COMB:
			s = new CombSort();
			break;
		case COUNTING:
			s = new CountingSort();
			break;
		case HEAP:
			s = new HeapSort();
			break;
		case INSERTION:
			s = new InsertionSort();
			break;
		case MERGE:
			s = new MergeSort();
			break;
		case QUICK:
			s = new QuickSort();
			break;
		case RADIX:
			s = new RadixSort();
			break;
		case SELECTION:
			s = new SelectionSort();
			break;
		case SHELL:
			s = new ShellSort();
			break;
		default:
			s = null;
		}
		return s;
	}

}
