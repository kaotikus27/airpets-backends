package com.airpetsdb.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airpetsdb.project.model.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {

	Booking findBytransactionId(String transactionId);

	List<Booking> findAllByFacilityId(String facilityId);

	List<Booking> findAllByUserId(String userId);

	List<Booking> findAll();

	List<Booking> findAllByPaymentStatus(String paymentStatus);

	List<Booking> findAllByBookingStatus(String bookingStatus);

	List<Booking> findAllByUserIdAndBookingStatus(String userId, String bookingStatus);

	List<Booking> findAllByUserIdAndIsCompleted(String userId, String isCompleted);

	List<Booking> findAllByFacilityIdAndBookingStatus(String facilityId, String bookingStatus);

	List<Booking> findAllByFacilityIdAndIsCompleted(String facilityId, String isCompleted);

	List<Booking> findAllByIsRated(String isRated);

}
