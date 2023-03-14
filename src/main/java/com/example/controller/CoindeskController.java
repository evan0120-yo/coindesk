package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



@CrossOrigin("*")
@RestController
@RequestMapping(value = "/coindesk")
public class CoindeskController {
	
	private static final String COINDESK_URL = "https://api.coindesk.com/v1/bpi/currentprice.json";

	@GetMapping
	public ResponseEntity<?> callCoindeskApi() throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
        String jsonString = restTemplate.getForObject(COINDESK_URL, String.class);
        
        JSONObject json = new ObjectMapper().readValue(jsonString, JSONObject.class);
        
		return ResponseEntity.status(200).body(json);
	}
}
