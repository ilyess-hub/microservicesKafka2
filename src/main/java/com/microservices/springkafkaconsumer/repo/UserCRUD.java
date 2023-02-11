package com.microservices.springkafkaconsumer.repo;

import com.microservices.springkafkaconsumer.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCRUD extends JpaRepository<User,Integer> {

}

