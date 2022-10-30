package com.javaAssignment.services.transactions;

import com.javaAssignment.repositories.transactions.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TransactionsService {

    @Autowired
    TransactionsRepository repository;
}
