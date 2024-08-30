package com.weather.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.assignment.entity.WeatherResponse;
import com.weather.assignment.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
   
    @GetMapping
    public WeatherResponse getWeatherData(@RequestParam String city) {
    	return weatherService.getWeatherData(city);
    }
}
