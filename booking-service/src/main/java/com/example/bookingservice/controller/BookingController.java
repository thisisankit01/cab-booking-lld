//// filepath: online-cab-booking-service/booking-service/src/main/java/com/example/bookingservice/controller/BookingController.java
package com.example.bookingservice.controller;

import com.example.bookingservice.model.Booking;
import com.example.bookingservice.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    
    @Autowired
    private BookingRepository bookingRepository;
    
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        // Dummy driver assignment
        booking.setDriverId(1L);
        booking.setStatus("booked");
        return bookingRepository.save(booking);
    }
    
    @GetMapping("/{id}")
    public Booking getBooking(@PathVariable Long id) {
        return bookingRepository.findById(id).orElse(null);
    }
    
    @PutMapping("/{id}/cancel")
    public Booking cancelBooking(@PathVariable Long id) {
        Booking booking = bookingRepository.findById(id).orElse(null);
        if (booking != null) {
            booking.setStatus("cancelled");
            bookingRepository.save(booking);
        }
        return booking;
    }
}