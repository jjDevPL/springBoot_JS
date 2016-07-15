package com.jj.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jj.json.JsonModel;

@Controller
@ComponentScan
@RequestMapping(value="/main")
public class MainController {
	 @RequestMapping(value="/get", method=RequestMethod.GET)
	    public ModelAndView getUser() {

		 ModelAndView model= new ModelAndView("main");
;			return model;
	        // ...
	    }
	 @RequestMapping(value="/json", method=RequestMethod.GET)
	    public @ResponseBody JsonModel getJson() {

		 return new JsonModel("name", new Integer(666));
	    }

}
