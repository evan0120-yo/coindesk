package com.example.app;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.controller.CoindeskController;
import com.example.model.Coindesk;
import com.example.model.Currency;
import com.example.service.CoindeskService;
import com.example.service.CurrencyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@SpringBootTest
public class MyBakeryApplicationTests {
	
	@Autowired
	private CoindeskService coindeskService;
	
	@Autowired
	private CurrencyService currencyService;
	
	@Autowired
	private CoindeskController coindeskController;

	@Test
	public void addCoindesk() {
		Currency currency = new Currency();
		currency.setCurrencyName("測試幣值name");
		currency.setDescription("測試幣值description");
		currency.setRate(100.111);
		currency.setRateFloat(100.22);
		currency.setSymbol("測試幣值symbol");
		currencyService.testSaveCurrency(currency);
		
		Coindesk coindesk = new Coindesk();
		coindesk.setCurrencyId(currency.getCurrencyId());
		coindesk.setUpdateTime(LocalDateTime.now());
		coindeskService.testSaveCoindesk(coindesk);
	}
	
	@Test
	public void selectAndUpdateCoindesk() throws Exception {
		Long currencyId = 1L;
		Currency currency = currencyService.testSelectCurrency(currencyId);
		currency.setCurrencyName("測試update幣值name");
		currencyService.testUpdateCurrency(currency);
	}
	
	@Test
	public void deleteCoindesk() {
		Long currencyId = 1L;
		currencyService.testDeleteCurrency(currencyId);
	}
	
	@Test
	public void callCoindeskApi() throws JsonMappingException, JsonProcessingException {
		coindeskController.callCoindeskApi();
	}
	
	

}
