package com.wipro.car;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

	@Autowired
	private final CarRepository repository;

	public CarService(CarRepository repository) {
		this.repository = repository;
	}

	public List<Car> getCars() {
		return (List<Car>) repository.findAll();
	}

	public Car getCar(Long id) {
		Optional<Car> c = repository.findById(id);
		return c.get();
	}

	public List<Car> getCars(String brand) {
		List<Car> cars = repository.findAll();

		return cars.stream().filter(i -> i.getBrand().equals(brand)).collect(Collectors.toList());
	}

	public List<Car> getCars(boolean isGreaterThan5Lack) {
		return isGreaterThan5Lack ? repository.getGreatThan5Lacks() : repository.getLessThan5Lacks();
	}

	public List<String> getDistinctBrands() {
		return repository.getDistinctBrands();
	}

}