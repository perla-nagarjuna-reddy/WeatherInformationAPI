package com.weather.assignment.service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.weather.assignment.entity.Current;
import com.weather.assignment.entity.WeatherResponse;
import com.weather.assignment.entity.WeatherStackResponse;
@Service
public class WeatherService {

    
	private static final String API_KEY = "a45c18a13fa0157f4bac4c55571a9c0a";
    private static final String API_URL = "http://api.weatherstack.com/current";
    
    @GetMapping
    public WeatherResponse getWeatherData(@RequestParam String location) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + "?access_key=" + API_KEY + "&query=" + location;
        WeatherStackResponse response = restTemplate.getForObject(url, WeatherStackResponse.class);
        Current nagCurrent = response.getCurrent();
        WeatherResponse weatherResponse = new WeatherResponse();
        weatherResponse.setTemperature(nagCurrent.getTemperature());
        weatherResponse.setHumidity(nagCurrent.getHumidity());
        weatherResponse.setLocation(response.getLocation());
        return weatherResponse;
    }
}

