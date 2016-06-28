package com.citi.service;

import com.citi.model.Vehicle;

public interface VehicleService {
	
	public void insert(Vehicle vehicle);
	public void update(Vehicle vehicle);
	public void delete(String vehicleNo);
	public Vehicle findByVehicleNo(String vehicleNo);
}
