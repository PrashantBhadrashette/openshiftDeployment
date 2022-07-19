package com.bharat.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharat.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
