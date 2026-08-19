package com.phegon.phegonbank;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import com.phegon.phegonbank.dtos.NotificationDTO;
import com.phegon.phegonbank.entity.User;
import com.phegon.phegonbank.enums.NotificationType;
import com.phegon.phegonbank.service.NotificationService;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@EnableAsync
@RequiredArgsConstructor
public class PhegonbankApplication {

    private final NotificationService notificationService;

    public static void main(String[] args) {
        SpringApplication.run(PhegonbankApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
            NotificationDTO notificationDTO = NotificationDTO.builder()
                    .recipient("zsiddqui266@gmail.com")
                    .subject("HEllo testing email")
                    .body("Hey, this is a test eamil from jamal kausar😁")
                    .type(NotificationType.EMAIL)
                    .build();

            notificationService.sendEmail(notificationDTO, new User());
        };
    }

}
