package com.inder.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.inder.spring.model.Medicine;
import com.inder.spring.service.HomeService;

@Controller
@RequestMapping("/rest/")
public class HomeRest {
	
	@Autowired
	HomeService homeService;

	@RequestMapping(value="get/{player}/All.do",produces={"application/json"} ,method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody String getMedicine(@PathVariable String player){
		System.out.println("REST controller call"+player);
		
		Medicine medicine=new Medicine();
		medicine.setId(12);
		medicine.setName("Pent:,ted");
		medicine.setUses(player);
		medicine.setStock("5");
   Gson g=new  Gson();
  return g.toJson(homeService.getAllRecord());
		//return homeService.getAllRecord();
	}
}
