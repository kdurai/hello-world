package com.citi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.citi.model.Vehicle;
import com.citi.service.VehicleService;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {

	private VehicleService vehicleService;
	
	public void setVehicleService(VehicleService vehicleService){
		this.vehicleService = vehicleService;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void insert(Model model)
	{
		model.addAttribute("param",new Vehicle());
//		vehicleService.insert(vehicle);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void update(Vehicle vehicle)
	{
		
	}
	
	@RequestMapping(value="/query/{vehicleNo}", method=RequestMethod.GET)
	public void delete(@PathVariable("vehicleNo")String vehicleNo)
	{
		
	}
	
	@RequestMapping(value="/query/{vehicleNo}", method=RequestMethod.GET)
	public Vehicle findByVehicleNo(@PathVariable("vehicleNo")String vehicleNo)
	{
		return null;
	}
	
}
