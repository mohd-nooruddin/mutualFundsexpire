package com.mutualfunds.mf.entity.mutualFund;

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
@Table(name = "mfDetails")
public class MfDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int schemaId;
	String fundHouse;
	String symbol;
	String schemaName;
	String schemaCategory;
	String description;
	int currPrice;
	int delta;
}
