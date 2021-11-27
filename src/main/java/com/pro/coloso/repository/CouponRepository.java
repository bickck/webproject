package com.pro.coloso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.coloso.domain.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

}
