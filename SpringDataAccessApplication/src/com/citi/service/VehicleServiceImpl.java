package com.citi.service;

import com.citi.dao.VehicleDao;
import com.citi.model.Vehicle;

public class VehicleServiceImpl implements VehicleService {
	
	private VehicleDao vehicleDao;
	
	public void setVehicleDao(VehicleDao vehicleDao) 
	{
		this.vehicleDao=vehicleDao;	
	}

	@Override
	public void insert(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicleDao.insert(vehicle);
	}

	@Override
	public void update(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicleDao.update(vehicle);
	}

	@Override
	public void delete(String vehicleNo) {
		// TODO Auto-generated method stub
		vehicleDao.delete(vehicleNo);
	}

	@Override
	public Vehicle findByVehicleNo(String vehicleNo) {
		// TODO Auto-generated method stub
		return vehicleDao.findByVehicleNo(vehicleNo);
	}

}
