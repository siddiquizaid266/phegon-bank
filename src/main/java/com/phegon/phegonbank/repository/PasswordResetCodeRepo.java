package com.phegon.phegonbank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phegon.phegonbank.entity.PasswordResetCode;

public interface PasswordResetCodeRepo extends JpaRepository<PasswordResetCode, Long> {
	
	Optional<PasswordResetCode> findByCode(String code);
	
	void deleteByUserId(Long userId);

}
