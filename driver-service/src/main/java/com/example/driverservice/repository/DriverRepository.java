//// filepath: online-cab-booking-service/driver-service/src/main/java/com/example/driverservice/repository/DriverRepository.java
package com.example.driverservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.driverservice.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}