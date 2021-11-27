package com.pro.coloso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.coloso.domain.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{

}
