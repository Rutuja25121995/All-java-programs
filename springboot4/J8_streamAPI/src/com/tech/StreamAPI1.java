package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI1 {
	void oddNumber() {
		List<Integer> list1=new ArrayList();
		list1.add(31);
		list1.add(32);
		list1.add(33);
		list1.add(34);
		list1.add(35);
		list1.add(36);
		list1.add(37);
		System.out.println("before stream API");
		for(Integer num:list1) {
			if(num%2!=0) {
				System.out.println(num);
			}
		}
		System.out.println("using stream API");
		Stream<Integer> stream = list1.stream();
		stream.filter(x -> x % 2 != 0).forEach(x -> System.out.println(x));

	}
}
