package net.hoyoung.webapp.argularjs_demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	@RequestMapping("/list")
	public String list(Map<String,Object> model){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		for(int i=0;i<10;i++){
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("name", Math.random());
			map.put("home", Math.random());
			list.add(map);
		}
		model.put("list", list);
		return "list";
	}
}
