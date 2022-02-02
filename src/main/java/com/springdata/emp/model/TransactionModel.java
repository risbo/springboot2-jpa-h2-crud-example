package com.springdata.emp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.CallableStatement;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionModel {

    protected static final Logger LOG = LoggerFactory.getLogger(TransactionModel.class);
    private CallableStatement sqlStatement;
    private String errorMessage;
    private boolean isValid;
}
