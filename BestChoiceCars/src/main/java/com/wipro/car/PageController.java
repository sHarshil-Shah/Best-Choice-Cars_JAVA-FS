package com.wipro.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@Autowired
	CarService service;

	@RequestMapping(value = { "/", "/index" })
	public String homePage() {
		return "index";
	}

	@GetMapping("/byPrice")
	public String SearchByPricePage(Model model) {
		model.addAttribute("car", new Car());
		return "byPrice";
	}

	@GetMapping("/byBrand")
	public String SearchByBrandPage(Model model) {
		List<String> listBrands = service.getDistinctBrands();
		model.addAttribute("listBrands", listBrands);
		model.addAttribute("car", new Car());
		return "byBrand";
	}
}
