package com.kaanegevarlik.definexThirdHW;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;


public class WeatherAPI {

    //this is the url given from the api website for us to send requests
    String url = "https://api.weatherapi.com/v1/current.json?key=01aa07e4aaef4a3ba7b81820231102&q=Izmir&aqi=no";

    //This get method creates an object using restTemplate and prints it out on the console
    public void getRequest() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer xxxxx");
            HttpEntity<String> entity = new HttpEntity<>("", headers);

            Object res = restTemplate.exchange(url, HttpMethod.GET, entity, Object.class);
            System.out.println(res);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

