package com.phegon.phegonbank.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.phegon.phegonbank.dtos.AccountDTO;
import com.phegon.phegonbank.dtos.TransactionDTO;
import com.phegon.phegonbank.dtos.UserDTO;

public interface AuditorService {

    Map<String, Long> getSystemTotals();

    Optional<UserDTO> findUserByEmail(String email);

    Optional<AccountDTO> findAccountDetailsByAccountNumber(String accountNumber);

    List<TransactionDTO> findTransactionsByAccountNumber(String accountNumber);

    Optional<TransactionDTO> findTransactionById(Long transactionId);
}
