package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.Wishlist;
import com.airpetsdb.project.repository.WishlistRepository;

@Service
public class WishlistService {
	@Autowired
	private WishlistRepository wishlistRepo;

	public List<Wishlist> findall() {
		return wishlistRepo.findAll();
	}

	public Wishlist displayWishlistByWishlistId(String wishlistId) {
		return wishlistRepo.findByWishlistId(wishlistId);
	}

	public List<Wishlist> displayWishlistByUserIdAndIsRemoved(String userId, String isRemoved) {
		return wishlistRepo.findWishlistByUserIdAndIsRemoved(userId, isRemoved);
	}

	public Wishlist displayWishlistByUserIdAndFacilityIdAndIsRemoved(String userId, String facilityId,
			String isRemoved) {
		return wishlistRepo.findWishlistByUserIdAndFacilityIdAndIsRemoved(userId, facilityId, isRemoved);
	}

	public Wishlist addWishlist(Wishlist wishlist) {
		return wishlistRepo.save(wishlist);
	}

}
