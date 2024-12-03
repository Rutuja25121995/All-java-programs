package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestList {

	public static void main(String[] args) {
		List<Student> list1 = new ArrayList();

		Student s1 = new Student(1, "rutuja", "rutuja@gmail.com");
		Student s2 = new Student(2, "priya", "priya@gmail.com");
		Student s3 = new Student(3, "sneha", "sneha@gmail.com");
		Student s4 = new Student(4, "riya", "riya@gmail.com");
		Student s5 = new Student(4, "riya", "riya@gmail.com");
		Student s6 = new Student(5, "riya", "riya@gmail.com");
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		list1.add(s6);
		List<Student> l1 = list1.stream().filter(s -> s.getId() > 3).collect(Collectors.toList());
		System.out.println(list1);

		System.out.println(list1.stream().count());

		Set<String> setList = list1.stream().filter(s -> s.getId() > 3).map(s -> s.getName())
				.collect(Collectors.toSet());
		System.out.println(setList);

		Map<Integer, String> m1 = list1.stream().filter(s -> s.getId() < 3).
				collect(Collectors.toMap(Student::getId, Student::getName));
		System.out.println(m1);
		list1.stream().filter(s->s.getId()>2).forEach(s->System.out.println(s));
        
        System.out.println("parellel stream");
        list1.parallelStream().filter(s->s.getId()>2).forEach(s->System.out.println(s));

	}

}
