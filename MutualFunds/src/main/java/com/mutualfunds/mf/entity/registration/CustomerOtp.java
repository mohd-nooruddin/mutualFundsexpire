package com.mutualfunds.mf.entity.registration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customerOtp")
public class CustomerOtp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int customerId;
	int otp;
}
