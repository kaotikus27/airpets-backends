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

import com.airpetsdb.project.model.Booking;
import com.airpetsdb.project.service.BookingService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/bookings")
public class BookingController {
	@Autowired
	private BookingService bookingService;
//	@Autowired
//	private BookingRepository bookingRepo;

	@PostMapping("")
	private Booking submitUser(@RequestBody Booking booking) {
		return bookingService.submitMetadata(booking);
	}

	@GetMapping("/byTransaction/{transactionId}")
	private Booking getBookingDetails(@PathVariable("transactionId") String transactionId) {
		return bookingService.displayUserMetadata(transactionId);
	}

	@GetMapping("/byFacility/{facilityId}")
	private List<Booking> getAllBookingByFacilityId(@PathVariable("facilityId") String facilityId) {
		return bookingService.displayAllBookingByFacilityId(facilityId);
	}

	@GetMapping("/byUser/{userId}")
	private List<Booking> getAllBookingByUserId(@PathVariable("userId") String userId) {
		return bookingService.displayAllBookingByUserId(userId);
	}

	@GetMapping("/byPaymentStatus/{paymentStatus}")
	private List<Booking> getAllBookingByPaymentStatus(@PathVariable("paymentStatus") String paymentStatus) {
		return bookingService.displayAllBookingByPaymentStatus(paymentStatus);
	}

	@GetMapping("/byBookingStatus/{bookingStatus}")
	private List<Booking> getAllBookingByBookingStatus(@PathVariable("bookingStatus") String bookingStatus) {
		return bookingService.displayAllBookingByBookingStatus(bookingStatus);
	}

	@GetMapping("/byUserIdAndBookingStatus/{userId}/{bookingStatus}")
	private List<Booking> getAllBookingByUserIdAndBookingStatus(@PathVariable("userId") String userId,
			@PathVariable("bookingStatus") String bookingStatus) {
		return bookingService.displayAllBookingByUserIdAndBookingStatus(userId, bookingStatus);
	}

	@GetMapping("/byUserIdAndIsCompleted/{userId}/{isCompleted}")
	private List<Booking> getAllBookingByUserIdAndIsCompleted(@PathVariable("userId") String userId,
			@PathVariable("isCompleted") String isCompleted) {
		return bookingService.displayAllBookingByUserIdAndIsCompleted(userId, isCompleted);
	}

	@GetMapping("/byFacilityIdAndBookingStatus/{facilityId}/{bookingStatus}")
	private List<Booking> getAllBookingByFacilityIdAndBookingStatus(@PathVariable("facilityId") String facilityId,
			@PathVariable("bookingStatus") String bookingStatus) {
		return bookingService.displayAllBookingByFacilityIdAndBookingStatus(facilityId, bookingStatus);
	}

	@GetMapping("/byFacilityIdAndIsCompleted/{facilityId}/{isCompleted}")
	private List<Booking> getAllBookingByFacilityIdAndIsCompleted(@PathVariable("facilityId") String facilityId,
			@PathVariable("isCompleted") String isCompleted) {
		return bookingService.displayAllBookingByFacilityIdAndIsCompleted(facilityId, isCompleted);
	}

	@GetMapping("/byIsRated/{isRated}")
	private List<Booking> getAllBookingByIsRated(@PathVariable("isRated") String isRated) {
		return bookingService.displayAllBookingByIsRated(isRated);
	}

	@GetMapping("")
	public List<Booking> findAll() {
		return bookingService.findall();
	}

	// Adding booking
	@PostMapping("/addBooking")
	public Booking addBooking(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}
}
