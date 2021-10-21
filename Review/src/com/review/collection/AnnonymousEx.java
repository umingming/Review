package com.review.collection;

import java.util.Arrays;
import java.util.Comparator;

public class AnnonymousEx {

	public static void main(String[] args) {
		Integer[] nums = {3, 2, 4, 5, 1};
//		Arrays.sort(nums);
		
		Arrays.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		System.out.println(Arrays.toString(nums));
	}

}
