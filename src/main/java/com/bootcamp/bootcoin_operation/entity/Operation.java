package com.bootcamp.bootcoin_operation.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class Operation {
    private @Id String id;
    private String typeMovement;
    private Double amount;
    private String modePayment;
    private String numTransactionPayment;
    private String status;
    @CreatedDate
    private LocalDate createDate;
}
