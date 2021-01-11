package com.wipro.car;

import javax.persistence.*;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String brand;
	private String model;
	private int year;
	private int noKms;
	private int price;
	private boolean fuel; // true for petrol and false for diesel

	public Car() {
		super();
	}

	public Car(Long id, String brand, String model, int year, int noKms, int price, boolean fuel) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.noKms = noKms;
		this.price = price;
		this.fuel = fuel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNoKms() {
		return noKms;
	}

	public void setNoKms(int noKms) {
		this.noKms = noKms;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isFuel() {
		return fuel;
	}

	public void setFuel(boolean fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", year=" + year + ", noKms=" + noKms
				+ ", price=" + price + ", fuel=" + fuel + "]";
	}

}
