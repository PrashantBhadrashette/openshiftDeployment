package com.bharat.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bharat.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
		User findByEMAIL(String username);


}
