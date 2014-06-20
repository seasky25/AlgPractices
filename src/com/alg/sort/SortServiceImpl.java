package com.alg.sort;

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
