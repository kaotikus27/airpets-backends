package com.airpetsdb.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airpetsdb.project.model.Wishlist;

@Repository
public interface WishlistRepository extends CrudRepository<Wishlist, Integer> {

	List<Wishlist> findAll();

	Wishlist findByWishlistId(String wishlistId);

	List<Wishlist> findWishlistByUserIdAndIsRemoved(String userId, String isRemoved);

	Wishlist findWishlistByUserIdAndFacilityIdAndIsRemoved(String userId, String facilityId, String isRemoved);
}
