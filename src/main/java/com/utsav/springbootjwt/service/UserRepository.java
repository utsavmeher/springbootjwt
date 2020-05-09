package com.utsav.springbootjwt.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utsav.springbootjwt.model.Person;

public interface UserRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByUsername(String username);
}
