package com.intuit.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

@SpringBootApplication
@EnableJms
@Configuration
public class ReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReceiverApplication.class, args);
    }

    @Bean
    public JmsListenerContainerFactory<?> stockFactory(
            ConnectionFactory connectionFactory,
            DefaultJmsListenerContainerFactoryConfigurer configurer) {

                 DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
                 configurer.configure(factory, connectionFactory);
                return factory;
    }
}
