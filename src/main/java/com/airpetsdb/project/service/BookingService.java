package com.airpetsdb.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airpetsdb.project.model.Booking;
import com.airpetsdb.project.repository.BookingRepository;

@Service
public class BookingService {
	@Autowired
	private BookingRepository bookingRepo;

	public Booking submitMetadata(Booking booking) {
		return bookingRepo.save(booking);
	}

	public List<Booking> findall() {
		return bookingRepo.findAll();
	}

	public Booking displayUserMetadata(String transactionId) {
		return bookingRepo.findBytransactionId(transactionId);
	}

	public List<Booking> displayAllBookingByFacilityId(String facilityId) {
		return bookingRepo.findAllByFacilityId(facilityId);
	}

	public List<Booking> displayAllBookingByUserId(String userId) {
		return bookingRepo.findAllByUserId(userId);
	}

	public List<Booking> displayAllBookingByPaymentStatus(String paymentStatus) {
		return bookingRepo.findAllByPaymentStatus(paymentStatus);
	}

	public List<Booking> displayAllBookingByBookingStatus(String bookingStatus) {
		return bookingRepo.findAllByBookingStatus(bookingStatus);
	}

	public List<Booking> displayAllBookingByUserIdAndBookingStatus(String userId, String bookingStatus) {
		return bookingRepo.findAllByUserIdAndBookingStatus(userId, bookingStatus);
	}

	public List<Booking> displayAllBookingByUserIdAndIsCompleted(String userId, String isCompleted) {
		return bookingRepo.findAllByUserIdAndIsCompleted(userId, isCompleted);
	}

	public List<Booking> displayAllBookingByFacilityIdAndBookingStatus(String facilityId, String bookingStatus) {
		return bookingRepo.findAllByFacilityIdAndBookingStatus(facilityId, bookingStatus);
	}

	public List<Booking> displayAllBookingByFacilityIdAndIsCompleted(String facilityId, String isCompleted) {
		return bookingRepo.findAllByFacilityIdAndIsCompleted(facilityId, isCompleted);
	}

	public List<Booking> displayAllBookingByIsRated(String isRated) {
		return bookingRepo.findAllByIsRated(isRated);
	}

	public Booking addBooking(Booking booking) {
		return bookingRepo.save(booking);
	}
}
