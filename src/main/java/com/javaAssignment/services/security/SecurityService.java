package com.javaAssignment.services.security;

import com.javaAssignment.repositories.security.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class SecurityService {

    @Autowired
    SecurityRepository repository;
}
