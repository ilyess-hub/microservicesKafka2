package com.microservices.springkafkaconsumer.repo;

import com.microservices.springkafkaconsumer.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCRUD extends JpaRepository<User,String> {
}
