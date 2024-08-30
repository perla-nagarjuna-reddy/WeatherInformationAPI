package com.weather.assignment.entity;

public class WeatherStackResponse {
	 Location location;
    public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Current getCurrent() {
		return current;
	}
	public void setCurrent(Current current) {
		this.current = current;
	}
	private Current current;
}
