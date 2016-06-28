package com.citi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.citi.model.Vehicle;

public class JdbcVehicleDao implements VehicleDao {

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	@Override
	public void insert(Vehicle vehicle) {
		
		String sql = "INSERT INTO VEHICLE (VEHICLE_NO, COLOR, WHEEL, SEAT) VALUES (?, ?, ?, ?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vehicle.getVehicleNo());
			ps.setString(2, vehicle.getColor());
			ps.setInt(3, vehicle.getWheel());
			ps.setInt(4, vehicle.getSeat());
			ps.executeUpdate();
			ps.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
				} finally {
					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {}
			}
		}
	}

	@Override
	public void update(Vehicle vehicle) {
		
		String sql = "UPDATE VEHICLE SET COLOR=?,WHEEL=?,SEAT=? WHERE VEHICLE_NO=?";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vehicle.getColor());
			ps.setInt(2, vehicle.getWheel());
			ps.setInt(3, vehicle.getSeat());			
			ps.setString(4, vehicle.getVehicleNo());
			ps.executeUpdate();
			ps.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
				} finally {
					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {}
			}
		}
		
	}

	@Override
	public void delete(String vehicleNo) {
		String sql = "DELETE VEHICLE WHERE VEHICLE_NO=?";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vehicleNo);
			ps.executeUpdate();
			ps.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
				} finally {
					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {}
			}
		}
	}

	@Override
	public Vehicle findByVehicleNo(String vehicleNo) {
		String sql = "SELECT * FROM VEHICLE WHERE VEHICLE_NO = ?";
		Connection conn = null;
		try {
		conn = dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, vehicleNo);
		Vehicle vehicle = null;
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
		vehicle = new Vehicle(rs.getString("VEHICLE_NO"),rs.getString("COLOR"), rs.getInt("WHEEL"),	rs.getInt("SEAT"));
		}
		rs.close();
		ps.close();
		return vehicle;
		} catch (SQLException e) {
		throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
				}
		}
	}

}
