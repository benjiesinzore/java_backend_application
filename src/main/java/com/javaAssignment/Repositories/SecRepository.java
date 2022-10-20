package com.javaAssignment.Repositories;

import com.javaAssignment.Models.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecRepository extends JpaRepository<Cities, Integer> {
}
