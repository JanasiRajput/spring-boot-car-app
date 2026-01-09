package ca.sheridancollege.rajputja.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.rajputja.beans.Car;

@Controller
public class CarController {
	public static ArrayList<Car> cars = new ArrayList<Car>();	
	@GetMapping("/add")
	public String goAddCarPage(Model model) {
		model.addAttribute("car", new Car());
		return "addCar.html";
	}
	@PostMapping("/add")
	public String processAddCarPage(@ModelAttribute Car car) {
/*		RequestParam String make,	@RequestParam String model,
			@RequestParam int year,
			@RequestParam double mileage,
			@RequestParam(defaultValue="false", required=false) boolean hybrid) {
		
		Car car = new Car();
		car.setMake(make);
		car.setModel(model);
		car.setYear(year);
		car.setMileage(mileage);
		car.setHybrid(hybrid);
		*/
		
		//System.out.println(car);
		cars.add(car);
		return "redirect:/add";
	}
	@GetMapping("/view")
	public String viewCarPage(Model model) {
		model.addAttribute("cars", cars);
		return "viewCars.html";
	}

}
