package com.tech;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Get_all_Controller {

	public Get_all_Controller() {
		System.out.println("inside Get_all_Controller constructor ");
	}

	@RequestMapping("/getall")
	public ModelAndView get_All_students() {
		System.out.println("inside get_All_students method");

		List<String> names = new ArrayList<String>();
		ModelAndView mav = new ModelAndView("get-all");

		names.add("rutuja");
		names.add("pooja");
		names.add("ashwini");
		names.add("neha");
		names.add("priya");
		mav.addObject("GET_ALL_LIST", names);
		return mav;
	}
}
