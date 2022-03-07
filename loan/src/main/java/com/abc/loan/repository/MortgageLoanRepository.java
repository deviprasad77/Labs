package com.abc.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.loan.entity.MortgageLoan;

@Repository
public interface MortgageLoanRepository extends JpaRepository<MortgageLoan,Integer> {

}
