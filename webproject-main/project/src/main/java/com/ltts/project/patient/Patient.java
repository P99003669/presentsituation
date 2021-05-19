package com.ltts.project.patient;

public class Patient {
	
	private int pid;
	private int id;
	private int Heart_Rate;
	private int Blood_Pressure;
	private int Oxygen_Level;
	private String timestamp;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHeart_Rate() {
		return Heart_Rate;
	}
	public void setHeart_Rate(int heart_Rate) {
		Heart_Rate = heart_Rate;
	}
	public int getBlood_Pressure() {
		return Blood_Pressure;
	}
	public void setBlood_Pressure(int blood_Pressure) {
		Blood_Pressure = blood_Pressure;
	}
	public int getOxygen_Level() {
		return Oxygen_Level;
	}
	public void setOxygen_Level(int oxygen_Level) {
		Oxygen_Level = oxygen_Level;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", id=" + id + ", Heart_Rate=" + Heart_Rate + ", Blood_Pressure="
				+ Blood_Pressure + ", Oxygen_Level=" + Oxygen_Level + ", timestamp=" + timestamp + "]";
	}
	public Patient(int pid, int id, int heart_Rate, int blood_Pressure, int oxygen_Level, String timestamp) {
		super();
		this.pid = pid;
		this.id = id;
		Heart_Rate = heart_Rate;
		Blood_Pressure = blood_Pressure;
		Oxygen_Level = oxygen_Level;
		this.timestamp = timestamp;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
