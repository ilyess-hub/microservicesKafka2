package com.microservices.springkafkaconsumer.repo;

import com.microservices.springkafkaconsumer.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCRUD extends CrudRepository<User,Integer> {

}

