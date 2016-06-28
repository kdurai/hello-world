package com.citi.dao;

import com.citi.model.Vehicle;

public interface VehicleDao {

	public void insert(Vehicle vehicle);
	public void update(Vehicle vehicle);
	public void delete(String vehicleNo);
	public Vehicle findByVehicleNo(String vehicleNo);
	
}
