package com.phegon.phegonbank.service;

import java.util.List;

import com.phegon.phegonbank.dtos.AccountDTO;
import com.phegon.phegonbank.entity.Account;
import com.phegon.phegonbank.entity.User;
import com.phegon.phegonbank.enums.AccountType;
import com.phegon.phegonbank.res.Response;

public interface AccountService {
    Account createAccount(AccountType accountType, User user);

    Response<List<AccountDTO>> getMyAccounts();

    Response<?> closeAccount(String accountNumber);
}
