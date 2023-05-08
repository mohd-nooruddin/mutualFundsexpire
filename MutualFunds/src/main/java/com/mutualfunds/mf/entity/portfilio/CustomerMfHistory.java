package com.mutualfunds.mf.entity.portfilio;

import java.util.Date;

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
@Table(name = "customerMfHistory")
public class CustomerMfHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int portfolioId;
	int customerId;
	int mfSchemaId;
	String mfName;
	String mfFundHouse;
	int mfUnit;
	String currency;
	int mfTransactionType;
	Date TransactionDate;
}
