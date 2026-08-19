package com.phegon.phegonbank.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.phegon.phegonbank.res.Response;
import com.phegon.phegonbank.service.AccountService;


@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/me")
    public ResponseEntity<Response<?>> getMyAccounts() {
        return ResponseEntity.ok(accountService.getMyAccounts());
    }

    @DeleteMapping("/close/{accountNumber}")
    public ResponseEntity<Response<?>> closeAccount(@PathVariable String accountNumber) {
        return ResponseEntity.ok(accountService.closeAccount(accountNumber));
    }


}
