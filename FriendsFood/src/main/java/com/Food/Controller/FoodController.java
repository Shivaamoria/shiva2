

package com.Food.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Food.Service.FoodService;

@Controller
public class FoodController {
	@Autowired
	FoodService foodservice;
	@RequestMapping("/")
	public String index()	{
		return "FPage.jsp";
	}
	@RequestMapping("/Chinese")
	public String FindChinese(String category, Model m) {
		category="chinese";
		m.addAttribute("product",foodservice.getAllProductByCategory(category));
		return"chinese.jsp";
	}
	@RequestMapping("/South Indian")
	public String FindSouth(String category, Model m) {
		category="South Indian";
		m.addAttribute("product",foodservice.getAllProductByCategory(category));
		return"southindian.jsp";
	}
	@RequestMapping("/North Indian")
	public String FindNorth(String category, Model m) {
		category="North Indian";
		m.addAttribute("product",foodservice.getAllProductByCategory(category));
		return"northindian.jsp";
	}
	
}