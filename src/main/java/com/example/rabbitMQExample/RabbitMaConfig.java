//package com.example.rabbitMQExample;
//
//import lombok.AllArgsConstructor;
//import org.springframework.amqp.core.*;
//import org.springframework.amqp.rabbit.annotation.EnableRabbit;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.context.annotation.Configuration;
//
//
//import java.util.Map;
//
//@Configuration
//@EnableRabbit
//@AllArgsConstructor
//public class RabbitMaConfig {
//    private final AmqpAdmin rabbitAdmin;
//
//    private final AmqpTemplate amqpTemplate;
//
//    @RabbitListener(queues = "myqueue")
//    public void processMessage(String content) {
//        System.out.println("My queue 1  =" + content);
//    }
//
//
//    @RabbitListener(queues = "myqueue2")
//    public void processMessage2(String content) {
//        System.out.println("My queue 2 = " + content);
//    }
//
//
//    public void declareQueue() {
//        String name = "my-queue";
//        String routingKey = "my-key";
//        boolean durable = true;
//        boolean exclusive = false;
//        boolean autoDelete = false;
//
//
//        String queueName = rabbitAdmin.declareQueue(new Queue(name, durable, exclusive, autoDelete));
//
//        String exchangeName = "my-exchange";
//        DirectExchange exchange = new DirectExchange(exchangeName, durable, autoDelete);
//        rabbitAdmin.declareExchange(exchange);
//
//        Binding.DestinationType destinationType = Binding.DestinationType.QUEUE;
//        Map<String, Object> arguments = null;
//        Binding binding = new Binding(queueName, destinationType, exchangeName, routingKey,
//                arguments);
//        rabbitAdmin.declareBinding(binding);
//    }
//
//    public void sendMessage(String exchange, String routingKey, Object message) {
//        amqpTemplate.convertAndSend(exchange, routingKey, message);
//    }
//}
