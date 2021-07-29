package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TypeSelection {

	@PostMapping("/selection")
	public String selection(@RequestParam("type") String s) {
		
		switch(s)
		{
		case "Select":return "Select";
		
		case "Update":return "Update";
		
		case "Insert":return "Insert";
		
		case "Delete":return "Delete";
		}
		return null;
		
	}
	
	
	
	
}
