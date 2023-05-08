package com.mutualfunds.mf.entity.portfilio;

import java.util.Date;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customerPortfolio")
public class CustomerPortfolio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int portfolioId;
	int customerId;
	@Nullable
	String mfName;
	@Nullable
	String mfFundHouse;
	int mfUnitAvailable = 0;
	String currency;
	@Nullable
	Date transactionDate;
	
}
