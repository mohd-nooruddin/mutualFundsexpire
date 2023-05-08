package com.mutualfunds.mf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mutualfunds.mf.entity.MutualFunds;

@Repository
public interface MutualFundsRepository extends CrudRepository<MutualFunds, Long>{
	
	@Query(value = "Select * from mutual_funds order by delta desc limit ?",nativeQuery = true)
	public List<MutualFunds> topMutualFundsDetails(int limits);
	
	@Query(value = "Select * from mutual_funds order by delta asc limit ?",nativeQuery = true)
	public List<MutualFunds> bottomMutualFundsDetails(int limits);
	
	@Modifying
	@Query(value = "Update mutual_funds set current_price= :price, delta= :delta where symbol=:symbol", nativeQuery = true)
	public void updateData(@Param("price") Double price,@Param ("delta") Double delta,@Param("symbol") String symbol);
	
	@Query(value = "Select * from mutual_funds where symbol=? limit 1",nativeQuery = true)
	public MutualFunds checkSymbol(String symbol);
}
