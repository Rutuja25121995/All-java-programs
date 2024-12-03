package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	void evenNumber() {
		List<Integer> list1 = new ArrayList();
		list1.add(22);
		list1.add(23);
		list1.add(24);
		list1.add(25);
		list1.add(26);
		list1.add(27);
		list1.add(28);
		System.out.println("before stream API");
		for (Integer num : list1) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		System.out.println("using stream API");
		Stream<Integer> stream = list1.stream();
		stream.filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

	}

}
