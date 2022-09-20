package com.emp.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BalanceRepository extends JpaRepository<Balance, Long> {
    List<Balance> findBycustomerID(long CustomerId);
    //List<Balance> findByProduct(String Product);
}