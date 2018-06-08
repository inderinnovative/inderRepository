package com.inder.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inder.spring.model.Medicine;
import com.inder.spring.service.HomeService;

@RestController
@RequestMapping("/rest/")
public class HomeRest {
	
	@Autowired
	HomeService homeService;

	@RequestMapping(value="get/{player}/All.do", method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody Medicine getMedicine(@PathVariable String player){
		System.out.println("REST controller call"+player);
		
		Medicine m=new Medicine();
		m.setId(12);
		m.setName("Pented");
		m.setUses(player);
		m.setStock("5");
		return m;
		//return homeService.getAllRecord();
	}
}
