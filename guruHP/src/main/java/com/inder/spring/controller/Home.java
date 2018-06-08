package com.inder.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.inder.spring.model.Medicine;
import com.inder.spring.service.HomeService;

@Controller
public class Home {

@Autowired
 HomeService homeService;

	@RequestMapping(value="/home.do",method=RequestMethod.GET)
	public ModelAndView homeInit(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		System.out.println("home.do");
	  return mv;
	}
	
	
	@RequestMapping(value="/search.do",method=RequestMethod.GET)
	public ModelAndView doSearch(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/view/result");
	  List<Medicine>ls=homeService.getAllRecord();
	  mv.addObject("result", ls);
		System.out.println("size:"+ls.size());
	  return mv;
	}
	
	
	@RequestMapping(value="/searchKey.do",method=RequestMethod.GET)
	public ModelAndView doSearchKey(@RequestParam String key){
		System.out.println("Pattern :"+key);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/view/result");
	  List<Medicine>ls=homeService.getRecordFromPattern(key);
	  mv.addObject("result", ls);
		System.out.println("size:"+ls.size());
	  return mv;
	}
	
}
