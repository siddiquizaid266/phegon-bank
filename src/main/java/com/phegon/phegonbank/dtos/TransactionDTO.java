package com.phegon.phegonbank.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.phegon.phegonbank.enums.TransactionStatus;
import com.phegon.phegonbank.enums.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {

    private Long id;

    private BigDecimal amount;

    private TransactionType transactionType;

    private LocalDateTime transactionDate;

    private String description;

    private TransactionStatus status;

    @JsonBackReference
    private AccountDTO account;

    //for transfer
    private String sourceAccount;
    private String destinationAccount;
}
