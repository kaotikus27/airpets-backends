package com.airpetsdb.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airpetsdb.project.model.Wishlist;
import com.airpetsdb.project.service.WishlistService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/wishlists")
public class WishlistController {
	@Autowired
	private WishlistService wishlistService;

	@GetMapping("byWishlistId/{wishlistId}")
	private Wishlist getWishlistByWishlistId(@PathVariable("wishlistId") String wishlistId) {
		return wishlistService.displayWishlistByWishlistId(wishlistId);
	}

	@GetMapping("byUserIdAndIsRemoved/{userId}/{isRemoved}")
	private List<Wishlist> getWishlistByUserIdAndIsRemoved(@PathVariable("userId") String userId,
			@PathVariable("isRemoved") String isRemoved) {
		return wishlistService.displayWishlistByUserIdAndIsRemoved(userId, isRemoved);
	}

	@GetMapping("byUserIdAndFacilityIdAndIsRemoved/{userId}/{facilityId}/{isRemoved}")
	private Wishlist getWishlistByUserIdAndFacilityIdAndIsRemoved(@PathVariable("userId") String userId,
			@PathVariable("facilityId") String facilityId, @PathVariable("isRemoved") String isRemoved) {
		return wishlistService.displayWishlistByUserIdAndFacilityIdAndIsRemoved(userId, facilityId, isRemoved);
	}

	@GetMapping("")
	public List<Wishlist> findAll() {
		return wishlistService.findall();
	}

	// Adding Wishlist
	@PostMapping("/addWishlist")
	public Wishlist addWishlist(@RequestBody Wishlist wishlist) {
		return wishlistService.addWishlist(wishlist);
	}
}
