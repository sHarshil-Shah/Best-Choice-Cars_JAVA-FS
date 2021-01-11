package com.wipro.car;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/cars")
public class CarController {
	@Autowired
	CarService service;

	@GetMapping
	public ResponseEntity<List<Car>> getAllCars() {
		List<Car> list = service.getCars();

		return new ResponseEntity<List<Car>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Car> getCarById(@PathVariable("id") Long id) {
		Car entity = service.getCar(id);

		return new ResponseEntity<Car>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/brands")
	public ModelAndView getCarsByBrand(@ModelAttribute("brand") String brand) {
		List<Car> cars = service.getCars(brand);
		ModelAndView mv = new ModelAndView("listBrands", "cars", cars);
		mv.addObject("car", new Car());
		return mv;
	}

	@GetMapping("/success")
	public ModelAndView goToSuccess(@ModelAttribute("carId") int id) {
		Car car = service.getCar((long) id);
		return new ModelAndView("success", "car", car);
	}

	@GetMapping("/price")
	public ModelAndView getCarsByPrice(@ModelAttribute("choice") boolean isGreaterThan5Lacks) {
		List<Car> cars = service.getCars(isGreaterThan5Lacks);
		ModelAndView mv = new ModelAndView("listBrands", "cars", cars);
		mv.addObject("car", new Car());
		return mv;
	}

}