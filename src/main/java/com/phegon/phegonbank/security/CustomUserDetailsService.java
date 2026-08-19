package com.phegon.phegonbank.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.phegon.phegonbank.entity.User;
import com.phegon.phegonbank.exception.NotFoundException;
import com.phegon.phegonbank.repository.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;    

    

	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user =userRepo.findByEmail(username)
                .orElseThrow(()-> new NotFoundException("Email Not Found"));

        return AuthUser.builder()
                .user(user)
                .build();
    }
}
