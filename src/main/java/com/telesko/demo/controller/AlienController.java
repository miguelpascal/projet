package com.telesko.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.telesko.demo.dao.AlienRepo;
import com.telesko.demo.model.Alien;

@Controller
public class AlienController {
	@Autowired
	AlienRepo alienObject;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("addAlien")
	public String addAlien(Alien alien) {
		alien.toString();
		alienObject.save(alien); 
		return "home";
	}
	
	@RequestMapping("getAlien")
	public ModelAndView getAlien( @RequestParam("aid") int aid) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("showAlien");
//		Alien alien= alienObject.findById(aid).orElse(new Alien());
		mv.addObject("alien",alienObject.findById(aid).orElse(new Alien()));
		System.out.println(alienObject.findByTech("Java"));
		System.out.println(alienObject.findByAidGreaterThan(aid));
		System.out.println(alienObject.findByTechSorted("Java"));
		return mv;
	}
	@RequestMapping("aliens")
	@ResponseBody
	public String getAliens() {
		
		return alienObject.findAll().toString();
			
	}
	@RequestMapping("aliens/{aid}")
	@ResponseBody
	public String getAlienn(@PathVariable("aid") int aid) {
		
		return alienObject.findById(aid).toString();
			
	}
	
}
