package com.abc.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.loan.entity.TypesOfMortgageLoans;

@Repository
public interface TypesOfMortgageLoansRepository extends JpaRepository<TypesOfMortgageLoans,String>{

}
