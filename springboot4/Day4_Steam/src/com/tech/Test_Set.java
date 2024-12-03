package com.tech;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test_Set {
	
	public static void main(String[] args) {
		
		Set<Student> slist = new HashSet<>();
		
		Student s1 = new Student(1, "aaa");
		Student s2 = new Student(2, "bbb");
		Student s3 = new Student(3, "ccc");
		Student s4 = new Student(4, "ddd");
		Student s5 = new Student(5, "eee");
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		slist.add(s5);
		
		//id > 2
		
		List<Student> list1=slist.stream().filter(s->s.getId()>2).collect(Collectors.toList());
		System.out.println(list1);
        System.out.println(list1.stream().count());	
		
        // names of id >2
        
        List<String> names=slist.stream().filter(s->s.getId()>2).map(s->s.getName()).collect(Collectors.toList());
		
        System.out.println(names);
        
        Set<Student> setSet=slist.stream().filter(s->s.getId()>2).collect(Collectors.toSet());
        System.out.println(setSet);
        
        Set<String> setSet1=slist.stream().filter(s->s.getId()>2).map(s->s.getName()).collect(Collectors.toSet());
        System.out.println(setSet1);
        
        // id and name 
        
        Map<Integer, String> map=slist.stream().filter(s->s.getId()>2).collect(Collectors.toMap(Student::getId, Student::getName));
		
        System.out.println(map);
        
        slist.stream().filter(s->s.getId()>2).forEach(s->System.out.println(s));
        
        System.out.println("parellel stream");
        slist.parallelStream().filter(s->s.getId()>2).forEach(s->System.out.println(s));
        
	}

}
