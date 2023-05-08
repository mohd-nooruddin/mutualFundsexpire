package com.mutualfunds.mf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mutualfunds.mf.entity.MutualFunds;
import com.mutualfunds.mf.repository.MutualFundsRepository;

@Service
public class MutualFundsService {
	@Autowired
	MutualFundsRepository mutualFundsRepository;
	
//	Finding all mutual funds data which has highest delta
	public List<MutualFunds> topMutualFundsDetails(int limit) {
		return mutualFundsRepository.topMutualFundsDetails(limit);
	}
	
//	Finding all mutual funds data which has lowest delta
	public List<MutualFunds> bottomMutualFundsDetails(int limit) {
		return mutualFundsRepository.bottomMutualFundsDetails(limit);
	}
	
//	Checking whether given symbol present in table or not 
	public Boolean checkSymbol(String symbol) {
		MutualFunds mutualFunds = null;
		mutualFunds= mutualFundsRepository.checkSymbol(symbol);
		if (mutualFunds== null) {
			return false;
		}
//		return mutualFundsRepository.checkSymbol(null);
		return true;
	}
	
	@Transactional
	public Boolean updateDeltaPrice(Double delta, String symbol) {
		if (checkSymbol(symbol)) {
			MutualFunds mutualFunds = mutualFundsRepository.checkSymbol(symbol);
			Double currPrice = mutualFunds.getCurrentPrice();
//			Double profitorloss;
//			profitorloss = (currPrice * delta)/100;
//			if (mutualFunds.getCurrentPrice() >= 0 ) {
				currPrice = mutualFunds.getCurrentPrice() + (currPrice * delta)/100;
//			}
//			else {
//				currPrice = mutualFunds.getCurrentPrice() - profitorloss; 
//			}	
//			return mutualFundsRepository.updateData(currPrice, delta, symbol);
			currPrice = Math.round(currPrice*100.0)/100.0;
			mutualFundsRepository.updateData(currPrice, delta, symbol);
//			mutualFundsRepository.
			System.out.println("Current Price : " +currPrice + " Profit or loss " + (currPrice * delta)/100 + "Row Updated : ");
			
			return true;
		}
		return false;
	}
}
