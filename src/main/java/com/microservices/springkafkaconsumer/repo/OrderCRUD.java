package com.microservices.springkafkaconsumer.repo;

import com.microservices.springkafkaconsumer.bean.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderCRUD extends CrudRepository<Order,Integer> {

}
