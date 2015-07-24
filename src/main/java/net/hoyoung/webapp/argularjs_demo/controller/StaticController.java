package net.hoyoung.webapp.argularjs_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/static")
public class StaticController {
	@RequestMapping(value="/{resType}",method=RequestMethod.GET)
	public String res(@PathVariable String resType){
		return "include/"+resType;
	}
}
