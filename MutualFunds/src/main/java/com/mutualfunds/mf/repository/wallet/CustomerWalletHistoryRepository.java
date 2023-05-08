package com.mutualfunds.mf.repository.wallet;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mutualfunds.mf.entity.wallet.CustomerWalletHistory;

@Repository
public interface CustomerWalletHistoryRepository extends CrudRepository<CustomerWalletHistory, Integer> {
	
	@Query(value = "SELECT * FROM CUSTOMER_WALLET_HISTORY WHERE CUSTOMER_ID=?", nativeQuery = true)
	public List<CustomerWalletHistory> getHistories(int customerId);
//	
//	@Query(value = "SELECT * FROM CUSTOMER_WALLET_HISTORY WHERE CUSTOMER_ID=? AND TRANSACTION_TYPE_ID=?", nativeQuery = true)
//	public List<CustomerWalletHistory> getHistoriesWithTransactionType(int customerId, int transactionTypeId);
	
}
