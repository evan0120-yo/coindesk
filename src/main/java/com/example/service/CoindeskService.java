package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Coindesk;
import com.example.repository.CoindeskRepository;

@Service
public class CoindeskService {

	@Autowired
	private CoindeskRepository coindeskRepository;
	
	public void testSaveCoindesk(Coindesk coindesk){
		coindeskRepository.save(coindesk);
	}
	
	public void testDeleteCoindesk(Long coindeskId){
		coindeskRepository.deleteById(coindeskId);
	}
	
	public void testUpdateCoindesk(Coindesk coindesk){
		coindeskRepository.save(coindesk);
	}
	
	public Coindesk testSelectCoindesk(Long coindeskId) throws Exception{
		Coindesk coindesk = coindeskRepository.findById(coindeskId).orElseThrow(() -> new Exception("該coindesk值不存在"));
		return coindesk;
	}
}
