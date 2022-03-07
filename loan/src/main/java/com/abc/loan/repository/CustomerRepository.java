package com.abc.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.loan.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
