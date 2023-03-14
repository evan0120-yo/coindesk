package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Currency;
import com.example.repository.CurrencyRepository;

@Service
public class CurrencyService {

	@Autowired
	private CurrencyRepository currencyRepository;
	
	public void testSaveCurrency(Currency currency){
		currencyRepository.save(currency);
	}
	
	public void testDeleteCurrency(Long currencyId){
		currencyRepository.deleteById(currencyId);
	}
	
	public void testUpdateCurrency(Currency currency){
		currencyRepository.save(currency);
	}
	
	public Currency testSelectCurrency(Long currencyId) throws Exception{
		Currency currency = currencyRepository.findById(currencyId).orElseThrow(() -> new Exception("該currency值不存在"));
		return currency;
	}
}
