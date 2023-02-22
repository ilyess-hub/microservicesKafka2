package com.microservices.springkafkaconsumer.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservices.springkafkaconsumer.bean.Order;
import com.microservices.springkafkaconsumer.bean.User;
import com.microservices.springkafkaconsumer.repo.OrderCRUD;
import com.microservices.springkafkaconsumer.repo.UserCRUD;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class OrderNotificationListener {



    @Autowired
     private UserCRUD userCRUD;


    @KafkaListener(topics = "ORDER_TOPIC", groupId = "foo")
    public void listenGroupFoo(String message) {

        log.info("Received Message in group foo:[{}] ", message);

        ObjectMapper object = new ObjectMapper();
        User user = null;
        try {
            user = object.readValue(message, User.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        userCRUD.save(user);


    }
}
