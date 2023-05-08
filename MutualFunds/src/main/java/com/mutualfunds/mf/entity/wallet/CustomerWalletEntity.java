package com.mutualfunds.mf.entity.wallet;

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
@Table(name = "customerWallet")
public class CustomerWalletEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int walletId;
	private int customerId;
	private int walletBalance = 0;
	private Date TransationDate;
}
