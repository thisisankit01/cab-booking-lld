//// filepath: online-cab-booking-service/README.md

# Online Cab Booking Service

## Overview

This is a Java-based microservices project for an online cab booking service. It contains three microservices:

- **User Service**: Handles user registration, retrieval, and updates with JWT-based authentication and BCrypt password hashing.
- **Booking Service**: Manages ride booking, retrieval, and cancellation.
- **Driver Service**: Manages driver details retrieval.

## Technologies

- Java 17
- Spring Boot 3.2.0
- Maven 3.8+
- MySQL 8.0+
- VS Code with Java Extension Pack

## Project Structure

```
online-cab-booking-service/
├── pom.xml
├── user-service/
│   ├── pom.xml
│   └── src/main/java/com/example/userservice/...
├── booking-service/
│   ├── pom.xml
│   └── src/main/java/com/example/bookingservice/...
└── driver-service/
    ├── pom.xml
    └── src/main/java/com/example/driverservice/...
```

## Setup Instructions

1. **Database Setup**:  
   Create the following MySQL databases:

   - `user_db`
   - `booking_db`
   - `driver_db`  
     Update each service's `application.properties` with your MySQL credentials.

2. **Build the Project**:  
   From the root directory, run:

   ```bash
   mvn clean install
   ```

3. **Run the Services**:  
   Each service can be started via CLI. For example, to run the User Service:
   ```bash
   cd user-service
   mvn spring-boot:run
   ```
   Then run the Booking and Driver Services similarly:
   ```bash
   cd booking-service
   mvn spring-boot:run
   ```
   ```bash
   cd driver-service
   mvn spring-boot:run
   ```

## API Endpoints

### User Service (port 8081)

- **POST** `/api/users/register` — Register a new user.
- **GET** `/api/users/{id}` — Retrieve user details.
- **PUT** `/api/users/{id}` — Update user details.

### Booking Service (port 8082)

- **POST** `/api/bookings` — Create a new booking (with a dummy driver assignment).
- **GET** `/api/bookings/{id}` — Retrieve booking details.
- **PUT** `/api/bookings/{id}/cancel` — Cancel a booking.

### Driver Service (port 8083)

- **GET** `/api/drivers/{id}` — Retrieve driver details.

## Future Enhancements

- Kafka integration
- WebSocket notifications
- Payment integration
- Location-based driver matching
# cab-booking-lld
