package com.abc.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.loan.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer>{
	

}
