

package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.chainsys.miniproject.pojo.Doctor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoctorDao {

	/*
	 * getConnection() insertDoctor(Doctor newdoc) getDoctorById(int id)
	 * getAllDoctors() updateDoctors(Doctor newdoc) deleteDoctor(int id)
	 */

	public static Connection getConnection() {
		Connection mycon = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "oracle";

		try {
			Class.forName(driver);
			mycon = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mycon;
	}

	private static java.sql.Date convertToSql(java.util.Date date) {
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		return sqlDate;

	}

	public static int insertDoctor(Doctor newdoc) {

		Connection mycon = getConnection();
		PreparedStatement stmt = null;
		String insertquery = "insert into DOCTOR (DOCT_ID,DOCT_NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES)values (?,?,?,?,?,?,?)";
		int rows = 0;
		try {
			stmt = mycon.prepareStatement(insertquery);
			stmt.setInt(1, newdoc.getDoct_ID());
			stmt.setString(2, newdoc.getDoct_Name());
			stmt.setDate(3, convertToSql(newdoc.getDOB()));
			stmt.setString(4, newdoc.getSpeciality());
			stmt.setString(5, newdoc.getCity());
			stmt.setLong(6, newdoc.getPhone_No());
			stmt.setFloat(7, newdoc.getStandard_Fees());
			rows = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				mycon.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

	public static int updateDoctor(Doctor newdoc) {
		String updatequery = "update DOCTOR set DOCT_NAME=?,DOB=?,SPECIALITY=?,CITY=?,PHONE_NO=?,STANDARD_FEES=? where DOCT_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setString(1, newdoc.getDoct_Name());
			ps.setInt(7, newdoc.getDoct_ID());
			ps.setDate(2, convertToSql(newdoc.getDOB()));
			ps.setString(3, newdoc.getSpeciality());
			ps.setString(4, newdoc.getCity());
			ps.setLong(5, newdoc.getPhone_No());
			ps.setFloat(6, newdoc.getStandard_Fees());
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

	public static int updateDoctorName(int id, String name) {
		String updatequery = "update DOCTOR set DOCT_NAME=? where DOCT_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setString(1, name);
			ps.setInt(2, id);
			rows = ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static int deleteDoctor(int id) {
		String deletequery = "delete from DOCTOR where DOCT_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1, id);
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static Doctor getDoctorById(int id) {
		Doctor doc = null;
		String selectquery = " select DOCT_ID,DOCT_NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES from DOCTOR where DOCT_ID= ? ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			doc = new Doctor();
			if (rs.next()) {
				doc.setDoct_ID(rs.getInt(1));
				doc.setDoct_Name(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDOB(rs.getDate(3));
				doc.setSpeciality(rs.getString(4));
				doc.setCity(rs.getString(5));
				doc.setPhone_No(rs.getInt(6));
				doc.setStandard_Fees((float) rs.getInt(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return doc;

	}

	public static List<Doctor> getAllDoctors() {
		Doctor doc = null;
		String selectquery = " select DOCT_ID, DOCT_NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES from DOCTOR";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Doctor> alldoctors = new ArrayList();
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);

			rs = ps.executeQuery();
			while (rs.next()) {
				doc = new Doctor();
				doc.setDoct_ID(rs.getInt(1));
				doc.setDoct_Name(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDOB(date);
				doc.setSpeciality(rs.getString(4));
				doc.setCity(rs.getString(5));
				doc.setPhone_No(rs.getInt(6));
				doc.setStandard_Fees((float) rs.getInt(7));
				alldoctors.add(doc);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return alldoctors;
	}
}