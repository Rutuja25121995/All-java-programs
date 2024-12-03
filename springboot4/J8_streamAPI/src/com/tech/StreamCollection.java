package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCollection {
	public static void main(String[] args) {
             List<Integer> list=new ArrayList<>();
             list.add(10);
             list.add(11);
             list.add(12);
             list.add(13);
             list.add(14);
             list.add(15);
             list.add(16);
             list.add(17);
             list.add(18);
             list.add(19);
             list.add(20);
             
             System.out.println("before stream API");
             for(Integer l1:list) {
            	 System.out.println(l1);
             }
             System.out.println("Using stream API");
             Stream<Integer> stream=list.stream();
             stream.forEach(x->System.out.println(x));
             
	}
}
