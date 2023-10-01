package com.airpetsdb.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airpetsdb.project.model.BookingAddons;

@Repository
public interface BookingAddonsRepository extends CrudRepository<BookingAddons, Integer> {
	BookingAddons findBytransactionId(String transactionId);

	List<BookingAddons> findAll();
}
