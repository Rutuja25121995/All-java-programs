package com.example.demo.controlller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	public StudentController() {
		System.out.println("inside  StudentController const");
	}

	@RequestMapping(value = "/getName1")
	public String getName1(@RequestParam("name") String name1) {
		System.out.println("inside getName1()->" + name1);
		return "Hello " + name1;
	}

	// @GetMapping("/getName")
	@RequestMapping(value = "/getName", method = RequestMethod.GET)
	public String getName(@RequestParam("name") String name1) {
		System.out.println("inside getName()->" + name1);
		return "Hello " + name1;
	}

	@RequestMapping(value = "/getName2", method = RequestMethod.GET)
	public String getName2(@RequestParam("fname") String fname1, @RequestParam("lname") String lname1) {
		System.out.println("inside getName2()->" + fname1);
		System.out.println("inside getName2()->" + lname1);
		return "Hello " + fname1 + lname1;
	}

	@RequestMapping(value = "/getCourse/{cname}")
	public String getCourse(@PathVariable("cname") String cname) {
		System.out.println("inside getCourse()->" + cname);
		return "welcome to teching " + cname;
	}
	@RequestMapping(value = "/getCourse2/{cname}/{fee}")
	public String getCourse2(@PathVariable("cname") String cname,@PathVariable("fee") String fee) {
		System.out.println("inside getCourse2()->" + cname + fee);
		return "welcome to teching cournameis " + cname + " and fee" +fee;
	}
}
