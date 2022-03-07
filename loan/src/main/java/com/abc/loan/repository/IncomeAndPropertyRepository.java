package com.abc.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.loan.entity.IncomeAndProperty;

@Repository
public interface IncomeAndPropertyRepository extends JpaRepository<IncomeAndProperty,Integer>{

}
