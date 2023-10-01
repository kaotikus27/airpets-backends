package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.BookingAddons;
import com.airpetsdb.project.repository.BookingAddonsRepository;

@Service
public class BookingAddonsService {
	@Autowired
	private BookingAddonsRepository bookingAddonsRepo;

	public BookingAddons submitMetadata(BookingAddons bookingAddons) {
		return bookingAddonsRepo.save(bookingAddons);
	}

	public List<BookingAddons> findall() {
		return bookingAddonsRepo.findAll();
	}

	public BookingAddons displayUserMetadata(String transactionId) {
		return bookingAddonsRepo.findBytransactionId(transactionId);
	}

	public BookingAddons addBooking(BookingAddons bookingAddons) {
		return bookingAddonsRepo.save(bookingAddons);
	}
}
