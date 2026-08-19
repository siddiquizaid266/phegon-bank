package com.phegon.phegonbank.service;

import com.phegon.phegonbank.dtos.NotificationDTO;
import com.phegon.phegonbank.entity.User;

public interface NotificationService {
	  void sendEmail(NotificationDTO notificationDTO, User user);
}
