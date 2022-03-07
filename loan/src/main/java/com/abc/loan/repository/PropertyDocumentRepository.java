package com.abc.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.loan.entity.PropertyDocument;

@Repository
public interface PropertyDocumentRepository extends JpaRepository<PropertyDocument,Integer> {

}
