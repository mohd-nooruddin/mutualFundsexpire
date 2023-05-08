package com.mutualfunds.mf.entity.wishlist;

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
@Table(name = "customerWishlist")
public class CustomerWishlistEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int wishlistId;
	int customerId;
	@Nullable
	String mfName;
	@Nullable
	String mfFundHouse;
	int mfSchemaId;
}
