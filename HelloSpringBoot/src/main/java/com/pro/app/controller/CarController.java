package com.pro.app.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pro.app.model.Car;

import java.util.Arrays;
import java.util.List;

@RestController
public class CarController {
	
	@RequestMapping("/hello")
	public List<Car> getCarDetails(){
		return Arrays.asList(
			new Car("Perdua","Bezza"),
			new Car("KIA","Picanto")
		);
	}
}
