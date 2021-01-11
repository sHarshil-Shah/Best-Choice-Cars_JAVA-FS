package com.wipro.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping("/brands/{brand}")
	public ResponseEntity<List<Car>> getCarsByBrand(@PathVariable("brand") String brand) {
		List<Car> entity = service.getCars(brand);
		return new ResponseEntity<List<Car>>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/price/{price}")
	public ResponseEntity<List<Car>> getCarsByPrice(@PathVariable("price") boolean isGreaterThan5Lacks) {
		List<Car> entity = service.getCars(isGreaterThan5Lacks);
		return new ResponseEntity<List<Car>>(entity, new HttpHeaders(), HttpStatus.OK);
	}
}