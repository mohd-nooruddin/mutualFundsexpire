package com.mutualfunds.mf.controller.wallet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.mutualfunds.mf.entity.wallet.CustomerWalletHistory;
import com.mutualfunds.mf.service.wallet.CustomerWalletHistoryService;


@Controller
@RequestMapping("mutualfunds/wallet")
public class CustomerWalletHistoryController {
	@Autowired
	CustomerWalletHistoryService customerWalletHistoryService;
	
//	http://localhost:8090/mutualfunds/details/top?limit=5
	@GetMapping(value = "/history", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<CustomerWalletHistory>> getHistory(@RequestParam("customerId") int customerId){
		
//		if(customerId != null) {
//			return ResponseEntity.ok(customerWalletHistoryService.getHistories(customerIds));
//		}
		System.out.println(customerId);
		List<CustomerWalletHistory> customerWalletHistories = customerWalletHistoryService.getHistories(customerId);
		for (CustomerWalletHistory customerWalletHistory : customerWalletHistories) {
			System.out.println(customerWalletHistory.getCustomerId());
		}
		return ResponseEntity.ok(customerWalletHistoryService.getHistories(customerId));
	}
	
}