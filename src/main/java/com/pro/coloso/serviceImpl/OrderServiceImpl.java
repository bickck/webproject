package com.pro.coloso.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pro.coloso.domain.Coupon;
import com.pro.coloso.domain.Lecture;
import com.pro.coloso.domain.Orders;
import com.pro.coloso.domain.User;
import com.pro.coloso.repository.CouponRepository;
import com.pro.coloso.repository.OrdersRepository;
import com.pro.coloso.repository.UserRepository;
import com.pro.coloso.service.OrderService;
// 데이터 베이스 구조가 병신이면 아무것도 못한다!

//리퀘스트가 들어오면 해당 강의 아이디와 쿠폰 사용 여부를 탐색
//사용자가 쿠폰을 사용하면 쿠폰 저장소에 있는 사용자 쿠폰을 없앤다.

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrdersRepository ordersRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CouponRepository couponRepository;
	
		
	@Override
	@Transactional
	public void requestOrder(User user , Lecture lecture, Coupon coupon) {
		// TODO Auto-generated method stub
		Orders order = new Orders(user,lecture.getLectureName(),lecture.getPrice());
		
		ordersRepository.save(order);
		
	}
}
