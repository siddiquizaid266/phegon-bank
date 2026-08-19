package com.phegon.phegonbank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phegon.phegonbank.entity.User;


public interface UserRepo extends JpaRepository<User, Long>{

	Optional<User> findByEmail(String email);
}
