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

import com.airpetsdb.project.model.BookingAddons;
import com.airpetsdb.project.service.BookingAddonsService;

@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:4000" }, maxAge = 3600)
@RestController
@RequestMapping("/bookingAddons")
public class BookingAddonsController {
	@Autowired
	private BookingAddonsService bookingAddonsService;
//	@Autowired
//	private BookingRepository bookingRepo;

	@PostMapping("")
	private BookingAddons submitUser(@RequestBody BookingAddons bookingAddons) {
		return bookingAddonsService.submitMetadata(bookingAddons);
	}

	@GetMapping("/{transactionId}")
	private BookingAddons getUserDetails(@PathVariable("transactionId") String transactionId) {
		return bookingAddonsService.displayUserMetadata(transactionId);
	}

	@GetMapping("")
	public List<BookingAddons> findAll() {
		return bookingAddonsService.findall();
	}

//	@GetMapping("/byCCTV")

	// Adding bookingAddons
	@PostMapping("/addBookingAddons")
	public BookingAddons addBooking(@RequestBody BookingAddons bookingAddons) {
		return bookingAddonsService.addBooking(bookingAddons);
	}
}
