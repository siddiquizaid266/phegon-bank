package com.phegon.phegonbank.service;

import java.util.List;

import com.phegon.phegonbank.dtos.TransactionDTO;
import com.phegon.phegonbank.dtos.TransactionRequest;
import com.phegon.phegonbank.res.Response;

public interface TransactionService {
    Response<?>createTransaction(TransactionRequest transactionRequest);
    Response<List<TransactionDTO>> getTransactionsForMyAccount(String accountNumber, int page, int size);
}