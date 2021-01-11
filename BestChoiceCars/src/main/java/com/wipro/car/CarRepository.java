package com.wipro.car;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
	@Query(value = "SELECT DISTINCT brand FROM Car")
	public List<String> getDistinctBrands();
}
