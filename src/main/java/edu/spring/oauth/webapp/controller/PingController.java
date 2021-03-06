package edu.spring.oauth.webapp.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ping")
public class PingController {
	
	@RequestMapping(method=RequestMethod.GET,path = "/message/{value}")
	@ResponseBody
	public Map<String,String> getPing(@PathVariable String value)
	{
		Map<String,String> map = new HashMap<>();
		map.put("message", "Received message "+value+" at "+LocalDate.now().toString());
		return map;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Map<String,String> get()
	{
		Map<String,String> map = new HashMap<>();
		map.put("message", "Received ping at "+LocalDate.now().toString());
		return map;
	}

}
