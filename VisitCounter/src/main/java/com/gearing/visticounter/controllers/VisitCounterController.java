package com.gearing.visticounter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class VisitCounterController {
	
	@GetMapping("")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null)
			session.setAttribute("count", 1); // The requirements say to start at zero, but if they are on the page, then it should be one by default
		else
			session.setAttribute("count", (Integer)session.getAttribute("count") + 1);
		
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String counter(HttpSession session) {
		if(session.getAttribute("count") == null)
			session.setAttribute("count", 0);
		return "visitcounter.jsp";
	}
	
	@GetMapping("/increaseByTwo")
	public String increaseByTwo(HttpSession session) {
		if(session.getAttribute("count") == null)
			session.setAttribute("count", 0);
		else 
			session.setAttribute("count", (Integer)session.getAttribute("count") + 2);
		return "index.jsp";
	}
	
	@PostMapping("/resetSession")
	public String resetCounter(HttpSession session) {
		session.setAttribute("count", 0);
		
		return "redirect:/counter";
	}
}
