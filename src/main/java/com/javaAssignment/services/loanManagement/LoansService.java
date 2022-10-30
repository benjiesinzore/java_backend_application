package com.javaAssignment.services.loanManagement;

import com.javaAssignment.repositories.loanManagement.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class LoansService {

    @Autowired
    LoansRepository repository;

}
