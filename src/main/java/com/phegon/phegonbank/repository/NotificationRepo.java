package com.phegon.phegonbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phegon.phegonbank.entity.Notification;

public interface NotificationRepo extends JpaRepository<Notification, Long> {
}
