package com.microservices.springkafkaconsumer.repo;

import com.microservices.springkafkaconsumer.bean.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderCRUD extends JpaRepository<Order,Integer> {

}
